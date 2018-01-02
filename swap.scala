/*import Array._

object swap {
	def main(args:Array[String]){
		val arr = Array(14,5,3,4,34,56,23,23)

				var i=0
				var temp=0
  	for ( i <- 0 until arr.length)
				{
				  temp=arr(i)
				  arr(i-1)=temp
				  arr(i)=arr(i+1)
				  println(" " + arr(i+1) + " " + arr(i))
				}	
	  }   
}

*/

//Swap adjacent elements of an array of integers Array(1,2,3,4,5) to (2,4,3,5,1)

object swap {
  def main(args:Array[String]){
  val a = Array(1,2,3,4,5) 
for(i <-0 until(if(a.length %2 ==0) a.length else a.length - 1)if(i%2==1)){
  
  val temp = a(i)
  a(i) = a(i-1)
  a(i-1) = temp
}
 for(i<-0 until a.length)
   println(a(i))
}
}

