import java.util.*;

public class Quiz5_3 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int evenSum = 0, oddSum = 0, evenCount = 0, oddCount = 0;
		Boolean loopControl = false;
		int aNumber = 0;
		
		while (loopControl != true) {
		   
		    aNumber = userInput.nextInt();
		    
    		if (aNumber < 0){
    		    loopControl = true;
    		 }
    		    		
    		else {
    			if (aNumber == 0) {
    				break;
    			}
    			
    			else if (aNumber % 2 == 0){
            		evenSum += aNumber;
            		evenCount++;
        	    }
        		
        		else {
            		oddSum += aNumber;
            		oddCount++;
        		}
    		}
    	}
		
    	// all separated by at least one space
		System.out.print(evenSum + " " + oddSum + " " + evenCount + 
				" " + oddCount);
		
		// Close Scanner
		userInput.close();
	}
}
