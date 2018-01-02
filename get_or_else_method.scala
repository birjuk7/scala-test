

object get_or_else_method {
          def main(args:Array[String]){

            
            val a:Option[Int]=Some(5)
            val b:Option[Int]=None
            
            
            println("a.getOrElse(0):"+a.getOrElse(0))
            println("b.getOrElse(10):"+b.getOrElse(10))
                       
            
            
          }
}