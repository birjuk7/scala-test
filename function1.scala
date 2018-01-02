

object function1 {
  def logStart()= "=" * 50 + " \n Starts now\n"+"="*50
  val start:()=>String = logStart
  def main(args:Array[String]){
    
    println(start())
  }
}