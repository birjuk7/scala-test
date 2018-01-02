
object function_exercise {
  def circleArea3(r:String):Double={
    r.isEmpty match {
      case true => 0
      case false => math.pow(r.toDouble,2) * math.Pi
    }
    }

def main(args:Array[String]){
  
 println(circleArea3("8"))
// println(circleArea3(" "))
  }
}