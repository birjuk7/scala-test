

abstract class Writer() {
  def write(msg:String)
}

class StringWriter extends Writer{
  val target = new StringBuilder()
  def write(msg:String)
  {
    target.append(msg)
    
  }
}