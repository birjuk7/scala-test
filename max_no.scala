// Max among 3 numbers

object max_no {
  def main(args:Array[String]){
  println("ENter the three numbers \n")
  
    val input1 = scala.io.StdIn.readLine();
    val input2 = scala.io.StdIn.readLine();
    val input3 = scala.io.StdIn.readLine();
    
    if (input1 > input2 && input1 > input3)
      println("Greatest no is : " + input1);
    else if (input2 > input3)
       println("Greatest no is : " + input2);
    else 
      println("Greatest no is : " +input3)
      
  }
}