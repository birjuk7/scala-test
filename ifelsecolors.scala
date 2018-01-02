

object ifelsecolors {
            def main(args:Array[String]){

              
        val colors =Map("red"->"#FF0000","azure"->"#F0FFFF","peru"->"#CD853F")
        if(colors.contains("red")){
          println("Red key exists wih value:"+ colors("red"))
        }else{
          println("Red key does not exit")
        }
        
       if(colors.contains("Maroon")){
          println("Maroon key exists wih value:"+ colors("maroon"))
        }else{
          println("Maroon key does not exit")
        }
            }
}