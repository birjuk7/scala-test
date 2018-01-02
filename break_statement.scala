 //import following package
  import scala.util.control._

object break_statement {
         def main(args: Array[String]){
           var a= 0;
           val numList=List(1,2,3,4,5,6,7,8,9,10);
           
             
        //create a break
           val loop = new Breaks;
           
           loop.breakable{
             for( a <-numList){
               println("Value of a:"+ a);
               
               if(a == 4){
                 loop.break;
               }
             }
           }
         }
     
}