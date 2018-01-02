

object function_time {
  def main(args:Array[String]){
    delayed(time());
    
  }
  def time()={
    println("getting time in nano seconds")
    System.nanoTime
   
  }
  def delayed(t: =>Long)={
    println("in delayed method")
    println("Param:"+t)
  }
}