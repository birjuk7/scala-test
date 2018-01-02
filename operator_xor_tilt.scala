

object operator_xor_tilt {
  def main(args: Array[String]){

    var a = 60;
    var b = 13;
    var c = 0;
    
    c= a & b;
    println("a&b = " + c);
    
        c= a | b;
    println("a|b = " + c);
    
        c= a ^ b;
    println("a^b = " + c);
    
        c= ~a;
    println("~a = " + c);
    
        c= a << 2;
    println("a << 2 = " + c);
    
        c= a >> 15;
    println("a >> 15 = " + c);
    
    
        c= a >>> 15;  //tilt operator not in java
    println("a >>> 15 = " + c);
  }
}