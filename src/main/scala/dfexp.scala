import org.apache.spark.sql.{SparkSession, DataFrame}
import org.apache.spark.sql.types.{StructType, StructField, IntegerType, StringType}

object dfexp {
  def main(args:Array[String]):Unit={
    val spark=SparkSession.builder().appName("dfexp").master("local[*]").getOrCreate()
    println("dfexp")
    spark.stop()
  }

}
