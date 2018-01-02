

object arthimatic_operation {
  
  def main(args: Array[String]){

    var a = 12;
    var b = 20;
    var c = 0;
    
    c= a + b;
    println("a + b = " + c);
    
        c += a ;
    println("c +=a " + c);
    
        c-= a;
    println("c-=a" + c);
    
        c *= a;
    println("c  *=a " + c);
    
       a = 10; c=15; c/=a;
    println("c /= a = " + c);
    
        a=10;c=15; c %=a;
    println("c%=a= " + c);
    
    
        c <<= 2;  
    println("c <<= 2 = " + c);
    c >>= 2;  
    println("c >>= 2 = " + c);
    
    c <<= 2;  
    println("c >>=a = " + c);
    
    c &= a;  
    println("c &=a = " + c);
    c ^a;  
    println("c ^a = " + c);
    
  }
}
