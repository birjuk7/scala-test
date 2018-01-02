import scala.io.Source

object match_2 {
    def main(args:Array[String]){

      println("Following is the content read:")
      
      Source.fromFile("Demo.txt").foreach{
        
        print
      }
    }
}