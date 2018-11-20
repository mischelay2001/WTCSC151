
public class MidtermTem {
	
	public static void main(String[] args) {
		
		String answer = "m";
		String guess = "v";
		int testResult = -999;
		char charAnswer = answer.charAt(0);
		char charGuess = guess.charAt(0);
				
		// Determine ASCII for a
		int uniCodeAnswer = (int) charAnswer;
		int uniCodeGuess = (int) charGuess;
			
		System.out.print("Answer number: " + uniCodeAnswer + " Guess: " + uniCodeGuess);
		// Go left - down alphabet
		if (uniCodeAnswer < uniCodeGuess) {
			testResult = -1;			
		}
		// Go right - up alphabet
		else if (uniCodeAnswer > uniCodeGuess) {
			testResult = 1;
		}
		// They are equal
		else {
			testResult = 0;
		}
				
		System.out.println(answer + guess + testResult);

 }
}

