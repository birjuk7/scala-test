import Array._

object traversing_array {
    def main(args:Array[String]){
      
       var a=Array(1.9,2.9,3.4,3.5)
       for(elem <- a)
         println(elem)
         
        println(a(0))
 
        
        val b = Array(2,3,5,7,11)
        val result = for(elem <-b) yield 2*elem
       
        for( elem<-result){
          println("Result is :"+elem)
        }
        //printing address of array
        print(result)
        //result is Array(4,6,10.14,22)
        
        //printing even number
        
       // val c = Array(2,3,5,7,11)
        for(elem <- b if elem%2 == 0) yield 2*elem
          
    }
}