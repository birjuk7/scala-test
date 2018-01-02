import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._ 

object WordCount {
  
def main(args:Array[String]) {  
 

val conf = new SparkConf().setAppName("wordCount").setMaster("local[*]")
val sc = new SparkContext(conf)

val textFile = sc.textFile("/home/hp/iot/Scala/Spark-codebase/book.txt")
val counts = textFile.flatMap(line => line.split(" "))
                 .map(word => (word, 1))
                 .reduceByKey(_ + _)
counts.saveAsTextFile("birjufile")

println("Total number of lines in file: "+ textFile.count())
println("Hello Spark");

}
}
	