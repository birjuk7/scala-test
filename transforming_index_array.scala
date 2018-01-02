import Array._

object transforming_index_array {
      def main(args:Array[String]){

       val a=Array(1,2,3,4,-5,8,-9)
       val indexes = for(i <- 0 until a.length if a(i)<0) yield i
       //It prints position of negative number
       println(indexes)
       
       for(elem <- indexes)    
          println(elem)

          
          /*  for(j <-(1 until indexes.length).reverse)a.remove(indexes(j))
       
       for(elem <- a)
          println(elem)

				This will remove -5,8,-9 that is it will remove nos when negative come
       */
          //below drop is used to remove no of elements to drop
          
       for(j <-(1 until indexes.length).reverse)a.drop(indexes(j))
       
       for(elem <- a)
          println(elem)
       
      
           
           
      }
}