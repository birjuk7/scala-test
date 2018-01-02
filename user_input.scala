

object user_input {
 
  def main(args:Array[String])
  {
    //take input check if odd/eve
    println("Enter  a number: ")
    val input = scala.io.StdIn.readInt()
    if(input%2==0)
    {
      println("input is even")
    }
    else
      println("input is odd")
      
    //take input and output the entered data
    println("ENter something to print\n")
    val input2 = scala.io.StdIn.readLine()
    println("Entered data is: "+input2)
  }
}
