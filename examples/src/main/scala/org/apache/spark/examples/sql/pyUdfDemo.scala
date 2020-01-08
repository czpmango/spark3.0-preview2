
package org.apache.spark.sql

import org.apache.spark.sql.MyIntegratedUDFUtils.{TestPythonUDF, TestScalaUDF, TestScalarPandasUDF}
import org.apache.spark.sql.catalyst.parser.{CatalystSqlParser, ParserInterface}
import org.apache.spark.sql.internal.SQLConf

object pyUdfDemo {

  val scalaUDF = TestScalaUDF(name = "scalaUDF")
  val pythonUDF = TestPythonUDF(name = "pythonUDF")
  val pandasUDF = TestScalarPandasUDF(name = "pandasUDF")

  def main(args: Array[String]): Unit = {

        type ParserBuilder = (SparkSession, ParserInterface) => ParserInterface
        type ExtensionsBuilder = SparkSessionExtensions => Unit

        val parserBuilder: ParserBuilder = (_, _) => CatalystSqlParser
        val extBuilderParser: ExtensionsBuilder = { e => e.injectParser(parserBuilder)}
        val spark = SparkSession.builder.appName("knn join demo")
           .withExtensions(extBuilderParser)
          .master("local").getOrCreate()
//    val spark = SparkSession
//      .builder
//      .appName("pyUdf test demo")
//      .getOrCreate()

    import spark.implicits._

   // val data1 = (0 until 12).toList.toSeq
    val df1 = spark.read.csv("/home/czp/csv/table1.csv").toDF()
    df1.createOrReplaceTempView("t1")

    val df2 = spark.read.csv("/home/czp/csv/table2.csv").toDF()
    df2.createOrReplaceTempView("t2")

//    spark.sql("select * from t1").show()
//    spark.sql("select * from t2").show()
    val res =
//    spark.sql("select * from t1 knn join t2 on t1.a1=t2.b1")
// spark.sql("select * from t1 join t2 on t1._c1=t2._c1")
spark.sql("select * from t1 knn join t2 using POINT (t2._c1, t2._c2) " +
                  "knnPred (POINT (t1._c1, t1._c2), 5)")
    res.show()
    res.explain()

  }
}
