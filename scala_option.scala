

object scala_option {
          def main(args:Array[String]){
          val capitals= Map("France"->"Paris","Japan"->"Tokoyo")
          
          
          println("capitals.get(\"France\"):"+capitals.get("France"))
          println("capitals.get(\"India\"):"+capitals.get("India"))
          }
          
            def show(x:Option[String])=x match{
            case Some(s)=>s
            case None=>"?"
          
          
          
          }
}