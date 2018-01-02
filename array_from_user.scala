

object array_from_user {
     def main(args:Array[String]){
       
     var arr1 = Array(1,2,3,4,5,6,7,8,9,10)
      //accept user input to print array till user input number
    println("\nEnter number you want ot see array upto")
    var specif = scala.io.StdIn.readInt()
    for(i<-0 to specif-1)
      print(" "+arr1(i))
     }
}