
package org.apache.spark.sql

import java.io.File
import java.nio.file.{Files, Paths}

import scala.collection.JavaConverters._
import scala.util.Try

import org.apache.spark.api.python.{PythonBroadcast, PythonEvalType, PythonFunction, PythonUtils}
import org.apache.spark.broadcast.Broadcast
import org.apache.spark.internal.config.Tests
import org.apache.spark.sql.{Column, SparkSession}
import org.apache.spark.sql.AnalysisException
import org.apache.spark.sql.catalyst.expressions.{Cast, Expression}
import org.apache.spark.sql.execution.python.UserDefinedPythonFunction
// what is diff below
import org.apache.spark.sql.expressions.{SparkUserDefinedFunction, UserDefinedAggregateFunction, UserDefinedFunction}
import org.apache.spark.sql.internal.SQLConf
import org.apache.spark.sql.types.StringType
// scala style:off
import org.apache.spark.util.Utils
// scala style:on

trait SQLHelper {

  /**
   * Sets all SQL configurations specified in `pairs`, calls `f`, and then restores all SQL
   * configurations.
   */
  protected def withSQLConf(pairs: (String, String)*)(f: => Unit): Unit = {
    val conf = SQLConf.get
    val (keys, values) = pairs.unzip
    val currentValues = keys.map { key =>
      if (conf.contains(key)) {
        Some(conf.getConfString(key))
      } else {
        None
      }
    }
    (keys, values).zipped.foreach { (k, v) =>
      if (SQLConf.staticConfKeys.contains(k)) {
        //        throw new AnalysisException("df")
      }
      conf.setConfString(k, v)
    }
    try f finally {
      keys.zip(currentValues).foreach {
        case (key, Some(value)) => conf.setConfString(key, value)
        case (key, None) => conf.unsetConf(key)
      }
    }
  }

  /**
   * Generates a temporary path without creating the actual file/directory, then pass it to `f`. If
   * a file/directory is created there by `f`, it will be delete after `f` returns.
   */
  protected def withTempPath(f: File => Unit): Unit = {
    val path = Utils.createTempDir()
    path.delete()
    try f(path) finally Utils.deleteRecursively(path)
  }
}

object MyIntegratedUDFUtils extends SQLHelper {
  import scala.sys.process._

  private lazy val pythonPath = sys.env.getOrElse("PYTHONPATH", "")
  private lazy val sparkHome = "/home/czp/workspace/spark-3.0.0-preview2"
  // Note that we will directly refer pyspark's source, not the zip from a regular build.
  // It is possible the test is being ran without the build.
  private lazy val sourcePath = Paths.get(sparkHome, "python").toAbsolutePath
  private lazy val py4jPath = Paths.get(
    sparkHome, "python", "lib", PythonUtils.PY4J_ZIP_NAME).toAbsolutePath
  private lazy val pysparkPythonPath = s"$py4jPath:$sourcePath"

  private lazy val isPythonAvailable: Boolean = true
  //  private lazy val isPythonAvailable: Boolean = TestUtils.testCommandAvailable(pythonExec)

  private lazy val isPySparkAvailable: Boolean = isPythonAvailable && Try {
    Process(
      Seq(pythonExec, "-c", "import pyspark"),
      None,
      "PYTHONPATH" -> s"$pysparkPythonPath:$pythonPath").!!
    true
  }.getOrElse(false)

  private lazy val isPandasAvailable: Boolean = isPythonAvailable && isPySparkAvailable && Try {
    Process(
      Seq(
        pythonExec,
        "-c",
        "from pyspark.sql.utils import require_minimum_pandas_version;" +
          "require_minimum_pandas_version()"),
      None,
      "PYTHONPATH" -> s"$pysparkPythonPath:$pythonPath").!!
    true
  }.getOrElse(false)

  private lazy val isPyArrowAvailable: Boolean = isPythonAvailable && isPySparkAvailable  && Try {
    Process(
      Seq(
        pythonExec,
        "-c",
        "from pyspark.sql.utils import require_minimum_pyarrow_version;" +
          "require_minimum_pyarrow_version()"),
      None,
      "PYTHONPATH" -> s"$pysparkPythonPath:$pythonPath").!!
    true
  }.getOrElse(false)

  private lazy val pythonVer = if (isPythonAvailable) {
    Process(
      Seq(pythonExec, "-c", "import sys; print('%d.%d' % sys.version_info[:2])"),
      None,
      "PYTHONPATH" -> s"$pysparkPythonPath:$pythonPath").!!.trim()
  } else {
    throw new RuntimeException(s"Python executable [$pythonExec] is unavailable.")
  }

  private lazy val pythonFunc = if (true) {
    var binaryPythonFunc: Array[Byte] = null
    withTempPath { path =>
      Process(
        Seq(
          pythonExec,
          "-c",
          "from pyspark.sql.types import StringType; " +
            "from pyspark.serializers import CloudPickleSerializer; " +
            s"f = open('$path', 'wb');" +
            "f.write(CloudPickleSerializer().dumps((" +
            "lambda x: None if x is None else str(int(x)+2), StringType())))"),
        None,
        "PYTHONPATH" -> s"$pysparkPythonPath:$pythonPath").!!
      binaryPythonFunc = Files.readAllBytes(path.toPath)
    }
    assert(binaryPythonFunc != null)
    binaryPythonFunc
  } else {
    throw new RuntimeException(s"Python executable [$pythonExec] and/or pyspark are unavailable.")
  }

  private lazy val pandasFunc: Array[Byte] = if (shouldTestScalarPandasUDFs) {
    var binaryPandasFunc: Array[Byte] = null
    withTempPath { path =>
      Process(
        Seq(
          pythonExec,
          "-c",
          "from pyspark.sql.types import StringType; " +
            "from pyspark.serializers import CloudPickleSerializer; " +
            s"f = open('$path', 'wb');" +
            "f.write(CloudPickleSerializer().dumps((" +
            "lambda x: x.apply(" +
            "lambda v: None if v is None else str(int(v)+3)), StringType())))"),
        None,
        "PYTHONPATH" -> s"$pysparkPythonPath:$pythonPath").!!
      binaryPandasFunc = Files.readAllBytes(path.toPath)
    }
    assert(binaryPandasFunc != null)
    binaryPandasFunc
  } else {
    throw new RuntimeException(s"Python executable [$pythonExec] and/or pyspark are unavailable.")
  }

  // Make sure this map stays mutable - this map gets updated later in Python runners.
  private val workerEnv = new java.util.HashMap[String, String]()
  workerEnv.put("PYTHONPATH", s"$pysparkPythonPath:$pythonPath")

  lazy val pythonExec: String = {
    val pythonExec = sys.env.getOrElse(
      "PYSPARK_DRIVER_PYTHON", sys.env.getOrElse("PYSPARK_PYTHON", "python3.5"))
    if (true) {
      //      if (TestUtils.testCommandAvailable(pythonExec)) {
      pythonExec
    } else {
      "python"
    }
  }

  lazy val shouldTestPythonUDFs: Boolean = isPythonAvailable && isPySparkAvailable

  lazy val shouldTestScalarPandasUDFs: Boolean =
    isPythonAvailable && isPandasAvailable && isPyArrowAvailable

  /**
   * A base trait for various UDFs defined in this object.
   */
  sealed trait TestUDF {
    def apply(exprs: Column*): Column

    val prettyName: String
  }

  /**
   * A Python UDF that takes one column, casts into string, executes the Python native function,
   * and casts back to the type of input column.
   *
   * Virtually equivalent to:
   *
   * {{{
   *   from pyspark.sql.functions import udf
   *
   *   df = spark.range(3).toDF("col")
   *   python_udf = udf(lambda x: str(x), "string")
   *   casted_col = python_udf(df.col.cast("string"))
   *   casted_col.cast(df.schema["col"].dataType)
   * }}}
   */
  case class TestPythonUDF(name: String) extends TestUDF {
    val udf = new UserDefinedPythonFunction(
      name = name,
      func = PythonFunction(
        command = pythonFunc,
        envVars = workerEnv.clone().asInstanceOf[java.util.Map[String, String]],
        pythonIncludes = List.empty[String].asJava,
        pythonExec = pythonExec,
        pythonVer = pythonVer,
        broadcastVars = List.empty[Broadcast[PythonBroadcast]].asJava,
        accumulator = null),
      dataType = StringType,
      pythonEvalType = PythonEvalType.SQL_BATCHED_UDF,
      udfDeterministic = true) {

      override def builder(e: Seq[Expression]): Expression = {
        assert(e.length == 1, "Defined UDF only has one column")
        val expr = e.head
        assert(expr.resolved, "column should be resolved to use the same type " +
          "as input. Try df(name) or df.col(name)")
        Cast(super.builder(Cast(expr, StringType) :: Nil), expr.dataType)
      }
    }

    def apply(exprs: Column*): Column = udf(exprs: _*)

    val prettyName: String = "Regular Python UDF"
  }

  /**
   * A Scalar Pandas UDF that takes one column, casts into string, executes the
   * Python native function, and casts back to the type of input column.
   *
   * Virtually equivalent to:
   *
   * {{{
   *   from pyspark.sql.functions import pandas_udf
   *
   *   df = spark.range(3).toDF("col")
   *   scalar_udf = pandas_udf(lambda x: x.apply(lambda v: str(v)), "string")
   *   casted_col = scalar_udf(df.col.cast("string"))
   *   casted_col.cast(df.schema["col"].dataType)
   * }}}
   */
  case class TestScalarPandasUDF(name: String) extends TestUDF {
    lazy val udf = new UserDefinedPythonFunction(
      name = name,
      func = PythonFunction(
        command = pandasFunc,
        envVars = workerEnv.clone().asInstanceOf[java.util.Map[String, String]],
        pythonIncludes = List.empty[String].asJava,
        pythonExec = pythonExec,
        pythonVer = pythonVer,
        broadcastVars = List.empty[Broadcast[PythonBroadcast]].asJava,
        accumulator = null),
      dataType = StringType,
      pythonEvalType = PythonEvalType.SQL_SCALAR_PANDAS_UDF,
      udfDeterministic = true) {

      override def builder(e: Seq[Expression]): Expression = {
        assert(e.length == 1, "Defined UDF only has one column")
        val expr = e.head
        assert(expr.resolved, "column should be resolved to use the same type " +
          "as input. Try df(name) or df.col(name)")
        Cast(super.builder(Cast(expr, StringType) :: Nil), expr.dataType)
      }
    }

    def apply(exprs: Column*): Column = udf(exprs: _*)

    val prettyName: String = "Scalar Pandas UDF"
  }

  /**
   * A Scala UDF that takes one column, casts into string, executes the
   * Scala native function, and casts back to the type of input column.
   *
   * Virtually equivalent to:
   *
   * {{{
   *   import org.apache.spark.sql.functions.udf
   *
   *   val df = spark.range(3).toDF("col")
   *   val scala_udf = udf((input: Any) => input.toString)
   *   val casted_col = scala_udf(df.col("col").cast("string"))
   *   casted_col.cast(df.schema("col").dataType)
   * }}}
   */
  case class TestScalaUDF(name: String) extends TestUDF {
    lazy val udf = new SparkUserDefinedFunction(
      (input: Any) => if (input == null) {
        null
      } else {
        input.toString
      },
      StringType,
      inputSchemas = Seq.fill(1)(None),
      name = Some(name)) {

      override def apply(exprs: Column*): Column = {
        assert(exprs.length == 1, "Defined UDF only has one column")
        val expr = exprs.head.expr
        assert(expr.resolved, "column should be resolved to use the same type " +
          "as input. Try df(name) or df.col(name)")
        Column(Cast(createScalaUDF(Cast(expr, StringType) :: Nil), expr.dataType))
      }
    }

    def apply(exprs: Column*): Column = udf(exprs: _*)

    val prettyName: String = "Scala UDF"
  }

  /**
   * Register UDFs used in this test case.
   */
  def registerTestUDF(testUDF: TestUDF, session: SparkSession): Unit = testUDF match {
    case udf: TestPythonUDF => session.udf.registerPython(udf.name, udf.udf)
    case udf: TestScalarPandasUDF => session.udf.registerPython(udf.name, udf.udf)
    case udf: TestScalaUDF => session.udf.register(udf.name, udf.udf)
    case other => throw new RuntimeException(s"Unknown UDF class [${other.getClass}]")
  }
}

