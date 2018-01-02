

object dayof_week {
        def main(args:Array[String]){
println("Enter a Number:")
val input=scala.io.StdIn.readLine()
if(input.toInt<0||input.toInt>7)
{
  print("No such day")
  System.exit(1)
  }
var DayName:String=""
input.toInt match{
    case 1=> DayName="Monday"
    case 2=> DayName="Tuesday"
    case 3=> DayName="Wednesday"
    case 4=> DayName="Thrusday"
    case 5=> DayName="Friday"
    case 6=> DayName="Saturday"
    case 7=> DayName="Sunday"

}
print("Day Name is:"+DayName)
        
        }
}