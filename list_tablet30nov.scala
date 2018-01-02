

object list_tablet30nov {
    def main(args:Array[String]){

      //create 5 elements using given function
      val squares = List.tabulate(6)(n=>n*n)
      println("squares:" + squares)
      
      val mul = List.tabulate(4,3)(_  *  _)
      println("mul:"+mul)
    }
}