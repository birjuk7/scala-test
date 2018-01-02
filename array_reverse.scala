//create an array of integers and print its element in reverse order

import Array._
object array_reverse {
    def main(args:Array[String]){
      
        val a=Array[Int](2,6,-1,9,0,4,6,1,8)
        for(i <-a.length-1 to 0 by -1 )
            {
            print(" " +a(i));
            }
    
  }
}
 /* for(i <-0 until a.length)
        {
        logic-swap 1element with last 2 with 2nd last
          val temp= a(i)
          a(i) = a()
        }*/

/* Sircode :	 var str = Array("AAa","BBa","CCc")
 *	 					 var strrev = str.reverse
 * 						 for(elem<-strrev)
 * 						  	println(elem)
 * 						 println("")
 * 						 for(i<-0 to str.length-1)
 * 						 		println(str(i).reverse)
 */


//Taking array as a input from the user




      