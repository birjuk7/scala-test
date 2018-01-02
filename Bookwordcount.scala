import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._ 


object Bookwordcount {
 
   /** Our main function where the action happens */
  def main(args: Array[String]) {
   
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
     // Create a SparkContext using every core of the local machine
    val sc = new SparkContext("local[*]", "BookWordCount")   
    
    // Load each line of my book into an RDD
    val input = sc.textFile("/home/hp/iot/Scala/Spark-codebase/book.txt")
    
    // Split using a regular expression that extracts words
    val words = input.flatMap(x => x.split(" "))
    
  
    // Count of the occurrences of each word
    val wordCounts = words.countByValue()
    
    // Print the results
    wordCounts.foreach(println)
  }
  
  
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}