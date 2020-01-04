
package org.apache.spark.sql

import org.apache.spark.sql.MyIntegratedUDFUtils.{TestPythonUDF, TestScalarPandasUDF}

object pyUdfDemo {

  val pythonTestUDF = TestScalarPandasUDF(name = "pyUDF")

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder
      .appName("pyUdf test demo")
      .getOrCreate()

    import spark.implicits._

    val data = (0 until 1000*1000).toList.toSeq

    val df = data
      .toDF("a")

    //    val df = spark.read.csv("/home/czp/csv/t2.csv")
    spark.udf.registerPython(pythonTestUDF.name, pythonTestUDF.udf) // register only package sql

    df.createOrReplaceTempView("table")
    val res = spark.sql("select pyUDF(a) from table").show()
//    res.explain(true)
  }
}
