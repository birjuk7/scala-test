

object loop_with_yield {
   def main(args: Array[String]){
     var a= 0;
     val numList = List(1,2,3,4,5,6,7,8,9,10);
     
     //for loop execution with a yield
     var retVal = for(a <-numList if a!=3; if a<8)yield a
     
     // now print returned value using another loop
     for( a <- retVal ){
         println("Value of a:"+a);
     }
     
   }
}

// yield mean to get something from other