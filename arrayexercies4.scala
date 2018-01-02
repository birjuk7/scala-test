

//write a code snippet that produces all values from an array with duplicates removed
import scala.collection.mutable.ArrayBuffer
object arrayexercies4 {
  def main(args:Array[String]){
    var a=Array[Int](1,1,22,2,2,3,4,5,6,6,7,8)
    var b = a.distinct
    for(i<-0 until b.length)
    println(b(i))
  }  
}