/*Given an array of integers, produce a new array 
 that contains all positive values of the original array, 
 in their original order ,folllowed by all values that are zero or negative, 
 in their original order */

import scala.collection.mutable.ArrayBuffer
object exercises_array1 {
    def main(args:Array[String]){
      
      val a = Array[Int](2,6,-1,9,0,-4,-6)
      val pos,oth= new ArrayBuffer[Int]
    for(i <-0 until a.length){
      if(a(i) > 0)pos+=i
      else oth +=i
    }
  
  var ab = new ArrayBuffer[Int]
  ab ++= (for(i <-pos) yield a(i))
  ab ++= (for(i <-oth) yield a(i))
  
  ab.toArray
  for(i <-0 until ab.length)
    println(ab(i))  
  }
}