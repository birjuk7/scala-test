

object string_interpolation {
      def main(args:Array[String]){

       var str1="Hello"
       var str2="World"
       var str="Hello World"
      
       println("Removing char l:" +str1.concat("").concat(str2).filter(!"l".contains(_)))
       println("Removing char l:" +str.filter(!"l".contains(_)))

      }
}