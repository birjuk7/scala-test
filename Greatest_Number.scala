

object Greatest_Number {
      def main(args:Array[String]) {
      println("Enter Three Numbers \n");
      val input1 = scala.io.StdIn.readLine();
      val input2 = scala.io.StdIn.readLine();
      val input3 = scala.io.StdIn.readLine();
      println("Entered no are "+input1+"\t"+input2+"\t"+input3);
      
      if(input1 > input2 && input1 > input3)
      {
        println("Greater Number is" + input1 +"\t");
      }
      
      else if(input2 > input3)
      {
        println("Greater Number is" + input2 +"\t");
      }
      
      else 
      {
        println("Greater Number is " + input3);
      }
    }
}