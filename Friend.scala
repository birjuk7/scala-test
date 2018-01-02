

trait Friend {
  val name:String
  def listen() =println("I am " +name + "Listening")
}
class Human(val name:String) extends Friend 
object TraitExample{
  def main(args:Array[String]){
    val sameer = new Human("Sameer")
    sameer.listen()
  
  }
}