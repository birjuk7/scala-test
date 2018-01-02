  import scala.util.control._

object concat_demo {



  
  def main(args:Array[String]){
    var floatVar = 12.456
    var intVar = 2000
    var stringVar="hello.scala"
   var fs = printf("The value of the float variable is "+"%f,while the value of the integer "+"variable string "+"is %s",floatVar,intVar,stringVar);
    
    println(fs)
  }
}

