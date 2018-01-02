

object mode_finding {
  
  def main(args:Array[String])
  {
    var arr1 = Array(1,2,3,4,2,1,5,3,5,3,6,3,2,0,9,0,7,0,5,0,4,0,6,7,2,3,2,4,2)
    
    var modeCount = 0;	// The count of the mode value
		var mode = 0;		// The value of the mode

		var currCount = 0;	
		var currElement = 0 
		
		// Iterate through all values in our array and consider it as a possible mode
		for (candidateMode<-arr1)
		{
			// Reset the number of times we have seen the current value
			currCount = 0;
			
			// Iterate through the array counting the number of times we see the current candidate mode
			for (elem<-arr1)
			{
				// If they match, increment the current count
				if (candidateMode == elem)
				{
					currCount+=1
				}
			}
			
			// We only save this candidate mode, if its count is greater than the current mode
			// we have stored in the "mode" variable
			if (currCount > modeCount)
			{
				modeCount = currCount;
				mode = candidateMode;
			}
		}
		
		println("Mode is: "+mode)
  }
}
