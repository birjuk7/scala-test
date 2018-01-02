import Array._

object max_mean_medain {
      def main(args:Array[String]){
        
        var arr = Array(14,5,3,4,34,56,23,23)
        
        val totalElement=arr.length
        println(totalElement)
        if(totalElement % 2==0)
          println((arr((totalElement/2)-1)+arr(totalElement/2))/2)
        else
          println("Median is : "+arr((totalElement/2)))
          
        println("Mean is :" + (arr.sum.toDouble/arr.length.toDouble))  
      }
}