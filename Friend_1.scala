

 trait Friend_1 {
  val name:String
  def listen() =println("I am " +name + "Listening")
}
 class human (val name:String) extends Friend_1 
 class Animal(val name:String)
 class Dog(override val name:String)extends Animal(name)with Friend
 class Cat(override val name:String)extends Animal(name)

 object traitExample{
  def seekHelp(friend:Friend)={
    friend.listen()
  }
  
     def main(args:Array[String]){
    val sameer = new Human("Sameer")
    val buddy = new Dog("Buddy")
    val tom =new Cat("Tom") with Friend
    seekHelp(sameer)
    seekHelp(buddy)
    seekHelp(tom)
}
}
