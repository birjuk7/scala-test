import Array._
import util.Random
//array exercise from 0(inclusive) to n(exclusive)

object random_exersion {
    def main(args:Array[String]){
        
  
  println("Inside Main")
}
var sum1=0
var sum=0    
val n =10
val a=new Array[Int](n)
for (i <- 0 until n)
  a(i)=Random.nextInt(n)
  
  println(a.mkString(", "))
 
  
  }
  