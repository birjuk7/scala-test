
import java.util.Date
object function_partially_applied {
    def main(args:Array[String]){
      
      val date=new Date
      log(date,"message1")
      
          
      Thread.sleep(1000)
       log(date,"message2")

      Thread.sleep(1000)
       log(date,"message3")

    }
    def log(date:Date,message:String) = {
      println(date + "__" +message)
    }
}