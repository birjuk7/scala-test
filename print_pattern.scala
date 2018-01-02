

object print_pattern {        
          println("Enter the Integer:")
          val input = scala.io.StdIn.readLine()
          val number=input.toInt
          for(i <- 1 to number)
          {
            for(j<-1 to i)
              print(j);
              println("")
          }
          
          
          

}