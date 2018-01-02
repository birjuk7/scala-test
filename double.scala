

object double {
  def double(x:Int):Int=x*2
  val myDouble:(Int)=>Int=double //1
  val myDoubleCopy=myDouble
  def main(args:Array[String]){
  double(5)
  myDouble(5)                   //2
  myDoubleCopy(5)               //3
 }
}