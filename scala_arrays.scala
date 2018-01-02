

object scala_arrays {
        def main(args:Array[String]){

          var z:Array[String]=new Array[String](3)
          
          //or
          
          var y = new Array[String](3)
            
          z(0) ="zara"; z(1) = "Nuha" ; z(4/2) = "Ayan"
          
          //or
          
          var u = Array("Zara","Nuha","Ayan")
          
        
        }
}

//int arr[3] ={1,2,3,4}		in C
// we can take [4]
//arr is pointer pointer to zeroth location
// arr[2] => *(arr+2)  it was allowed but result is different random