

object pattern_match {
    def main(args:Array[String]){

      val pattern = "(S|s)cala".r
      val str ="Scala is scalable and cool"
      println(pattern replaceFirstIn(str,"Java"))
      
    }
}
