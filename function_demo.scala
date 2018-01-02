

object function_demo {
   def main(args:Array[String]){
     
   
  println(multiplier(6,7))
  
  //Invoking either a parenthesis 
  GreetingToAll()
  //Invoking without parenthesis
  GreetingToAll
  
}
  def multiplier(x:Int,y:Int):Int = (x*y)
  
  //Invoking Function
  
  def GreetingToAll() = (println("Greeting to mayur CCCCCCCC"))

}


