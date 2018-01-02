/* How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order?
How do you do the same with an ArrayBuffer[Int] */

import scala.collection.mutable.ArrayBuffer //for array buffer
import Array._
object array_exercies3 {
      def main(args:Array[String]){

        val a=Array[Int](2,6,-1,9,0,-4,6,-1,8)
        var ar=a.sortWith(_>_)

        for(i<-0 until a.length)
        {
         
          //a.sortWith(_>_)
          println(ar(i))
        }
      }
}