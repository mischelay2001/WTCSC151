public class GuessALetterUtils {
	
	/**
	 * generateRandomLetter  
			Write a method.  This method takes no parameters.  It returns a String containing exactly one character between "a" and "z" (inclusive).  
			The returned character is randomly chosen.  Hint:  create a String constant initialized to "abcde...z", 
			and generate a random number to determine which position of the String to return.
				
	* @return fncvRandomChar
	*/
			
	public static String generateRandomLetter() {
		String fncvLowerA_Z = "abcdefghijklmnopqrstuvwxyz";
		
		int fncvRandom1_26 = -1;
		while (fncvRandom1_26 < 0 || fncvRandom1_26 >= fncvLowerA_Z.length()) {
			fncvRandom1_26 = (int)(Math.random() * 100);
			}
		String fncvRandomChar = Character.toString(fncvLowerA_Z.charAt(fncvRandom1_26));

		
		return fncvRandomChar;	
	}	
	
	/**compareTo
			This method takes two parameters, String solution and String guess.  
			It returns an int value.  The returned value is below 0 if solution comes before guess alphabetically, 
			above 0 if solution comes after guess alphabetically, and 0 if solution and guess have the same value.  
			Your method can use any negative int value to indicate "solution comes before guess," 
			and any positive value to indicate "solution comes after guess."
	* @param fncpAnswer
	* @param fncpGuess
	* @return fncvTestResult
	*/
	
	public static int compareTo(String fncpAnswer, String fncpGuess) {

		int fncvTestResult = -999;
		char fncvCharAnswer = fncpAnswer.charAt(0);
		char fncvCharGuess = fncpGuess.charAt(0);
				
		// Determine ASCII for a
		int fncvUniCodeAnswer = (int) fncvCharAnswer;
		int fncvUniCodeGuess = (int) fncvCharGuess;
			
		// Go left - down alphabet
		if (fncvUniCodeAnswer < fncvUniCodeGuess) {
			fncvTestResult = -1;			
		}
		// Go right - up alphabet
		else if (fncvUniCodeAnswer > fncvUniCodeGuess) {
			fncvTestResult = 1;
		}
		// They are equal
		else {
			fncvTestResult = 0;
		}
		
		return fncvTestResult;
	}	
}
