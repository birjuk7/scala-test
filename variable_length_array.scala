//import below class

import scala.collection.mutable.ArrayBuffer

object variable_length_array {
  def main(args:Array[String]){
    
    val b = ArrayBuffer[Int]()
    //or new ArrayBuffer[Int]
    //An empty array buffer,ready to hold integers
    b+=1
    // ArrayBuffer(1)
    //Add a element at the end with +=
    print(" b+=1 " +b)
    print("\n")
    
    b+=(1,2,3,5)
    //ArrayBuffer(1,1,2,3,5)
    //Add multiple elements at the end by enclosing them in parentheses
    print("b+=(1,2,3,5) " +b)
    print("\n")
    
    b++=Array(8,13,21)
    //ArrayBuffer(1,1,2,3,5,8,13,21)
    //you can append any collection with the b++=operator
    print(" b++=Array(8,13,21)) " +b)
    print("\n")
    
    b.trimEnd(5)
    //ArrayBuffer(1,2,2)
    //Removes the last five elements
    print("b.trimEnd(5)  " +b)
    print("\n")
    
    b.insert(2,6)
    //arrray buffer(1,1,2,6)
    //insert before index 2
    print(" b.insert(2,6))  " +b)
    print("\n")
    
    b.insert(2,7,8,9)
    //arrray buffer(1,1,7,8,9,6,2)
    //You can insert as many element as you like
    print("b.insert(2,7,8,9)  " +b)
    print("\n")
    
    
    b.remove(2)
    //Array Buffer(1,1,8,9,6,2)
    print(" b.remove(2)  " +b)
    print("\n")
    
    b.remove(2,3)
    //Array Buffer(1,1,2)
    //The second parameter says how many elements to remove
    print("b.remove(2,3)  " +b)
    print("\n")
    
    
  }
}