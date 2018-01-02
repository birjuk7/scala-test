

object function_demo3 {
  def main(args:Array[String]){
    println("Returned value :"+ addInt())
       
  }
  def addInt(a:Int = 5,b:Int = 7): Int = {
    var sum:Int =0
    sum = a+b
    return sum
  }
}