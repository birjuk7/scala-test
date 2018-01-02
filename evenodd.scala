import Array._

object evenodd {
	def main(args:Array[String]){
		val arr = Array(14,5,3,4,34,56,23,23)

				var i=0
				var sum_even =0
				var sum_odd =0

				for ( i <- 0 until arr.length)
				{
					if(arr(i) % 2==0)
					{
						sum_even = sum_even +arr(i)
					}       
					else
					{
						sum_odd =sum_odd +arr(i)
					}
				}
				
				println("Sum of even no is : "+ sum_even)
				println("Sum of odd no is : "+ sum_odd)
	  }   
}


/*Sir code */

//Sum of add integers and even integers in elements of array
/*

import Array._

object sum_odd_int_even_int {
  
def main(args:Array[String]){
  
 var arr = Array(5,4,9,8,6,6,7,1)
 
 var oddElemArray = for(elem <-arr if(elem % 2 != 0)) yield elem
 
 var evenElemArray = for(elem <-arr if(elem % 2 == 0)) yield elem
 
 println("Sum of Odd Elements: " + oddElemArray.sum)
 println("Sum of Even Elements: " + evenElemArray.sum)
}


  
}*/
