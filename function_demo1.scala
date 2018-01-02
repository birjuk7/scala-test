

object function_demo1 {
  def main(args:Array[String]){
    printStrings("Hello","Scala","Python");
  }
  
  def printStrings(args:String* )={
    var i: Int = 0;
    
    for(args <- args){
      println("Arg value["+i+"] = "+args);
      i=i+1;
    }
  }
}