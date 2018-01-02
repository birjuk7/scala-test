

object percentage_grade {
  

  def main(args:Array[String])
  {
    println("Enter  a subject1 marks: ")
    val sub1 = scala.io.StdIn.readInt()
    println("Enter  a subject2 marks: ")
    val sub2 = scala.io.StdIn.readInt()
    println("Enter  a subject3 marks: ")
    val sub3 = scala.io.StdIn.readInt()
    
    var total = sub1 + sub2 +sub3
    var percent = (total/3)
    println("percentage is: "+percent)
    if(percent>=90)
      println("you get A grade")
    else if(percent>=70&&percent<90)
      println("you get B grade")
    else
      println("you get C grade")
  }
}
