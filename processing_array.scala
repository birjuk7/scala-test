//add this line

import Array._

object processing_array {
         def main(args:Array[String]){
           
           var myList=Array(1.9,2.9,3.4,3.5)
           var i=0;
            println("")
            
           //print all the array elements
           for (x<-myList){
             println(x)
           }
           
           //summing all elements
           var total = 0.0;
           for( i<-0 to (myList.length-1)){
             total+=myList(i);
           }
           println("Total is :" + total);
           
           //finding the largest elements
           var max = myList(0);
           
           for(i<-1 to (myList.length-1)){
             if (myList(i) > max)max = myList(i) 
           }
           println("Max is :" + max)
           println(" ")
           
         }
}