
package org.apache.spark.sql

import org.apache.spark.sql.MyIntegratedUDFUtils.{TestPythonUDF, TestScalarPandasUDF, TestScalaUDF}

object pyUdfDemo {

  val scalaUDF = TestScalaUDF(name = "scalaUDF")
  val pythonUDF = TestPythonUDF(name = "pythonUDF")
  val pandasUDF = TestScalarPandasUDF(name = "pandasUDF")

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder
      .appName("pyUdf test demo")
      .getOrCreate()

    import spark.implicits._

    val data = (0 until 10000*100).toList.toSeq

    val df = data
      .toDF("a")

    //    val df = spark.read.csv("/home/czp/csv/t2.csv")

    spark.udf.register(scalaUDF.name, scalaUDF.udf) // register only package sql
    spark.udf.registerPython(pythonUDF.name, pythonUDF.udf) // register only package sql
    spark.udf.registerPython(pandasUDF.name, pandasUDF.udf) // register only package sql

    df.createOrReplaceTempView("table")
    spark.sql("cache table table")

// API
    val start = System.nanoTime()
    val res = df.select("a")
    val end = System.nanoTime()
    val timecost = (end - start)/1000000
    print("native expr time cost :" + timecost + "ms.\n")

// native expr
    val start0 = System.nanoTime()
    val res0 = spark.sql("select a from table").collect()
    val end0 = System.nanoTime()
    val timecost0 = (end0 - start0)/1000000
    print("native expr time cost :" + timecost0 + "ms.\n")

// scala udf
    val start1 = System.nanoTime()
    val res1 = spark.sql("select scalaUDF(a) from table").collect()
    val end1 = System.nanoTime()
    val timecost1 = (end1 - start1)/1000000
    print("scala udf time cost :" + timecost1 + "ms.\n")

    // python udf
    val start2 = System.nanoTime()
    val res2 = spark.sql("select pythonUDF(a) from table").collect()
    val end2 = System.nanoTime()
    val timecost2 = (end2 - start2)/1000000
    print("python udf time cost :" + timecost2 + "ms.\n")

    // py pandas udf
    val start3 = System.nanoTime()
    val res3 = spark.sql("select pandasUDF(a) from table").collect()
    val end3 = System.nanoTime()
    val timecost3 = (end3 - start3)/1000000
    print("pandas udf time cost :" + timecost3 + "ms.\n")
//    res.explain(true)
  }
}
