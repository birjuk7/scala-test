import scala.io.Source
import java.io._

object match_1 {
    def main(args:Array[String]){

      val writer = new PrintWriter(new File("test.txt"))
      
      writer.write("Hello Scala")
      writer.close()
      
    }
}