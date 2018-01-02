//Write  a program to print Ascii values from 1 to 128

object ascii {
  def main(args:Array[String])
  {
    for(i<-0 to 125)
    {
      var a = printf("%c \n",i)
      print(i+" in ascii is "+a+"\t")
    }
  }
}