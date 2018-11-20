import java.util.Scanner;

public class GuessALetter {

	public static void main(String[] args) {

		/**Guess A Letter
		
			Write a class GuessALetter with only a main method.  The main method uses generateRandomLetter and compareTo to implement the guessing game.  
			The program picks a random letter between "a" and "z".  It then repeatedly asks the user to enter a guess.  
			It gives hints to the user "Go to the left" or "Go to the right" to help him (or her) find the correct letter.  
			If the user picks the correct letter, the program prints "You got it" and exits. 
			
			A sample execution is attached:
			
			Guess a letter between a and z:  
			Enter your one-letter guess: l
			Go to the left
			Enter your one-letter guess: f
			Go to the right
			Enter your one-letter guess: i
			Go to the left
			Enter your one-letter guess: g
			You got it
			
		*/

		System.out.println("\n" + "Guess A Letter" + "\n");
		System.out.println("Program will ask for a letter from the user.");
		System.out.println("Program will generate a random letter between lowercase a through z.");
		System.out.println("Program will give hints until user enters the letter that matches the random letter.");

		
		
		
		Scanner kybd = new Scanner(System.in);
		
		
		// Generate random letter
		String systemRandomLetter = GuessALetterUtils.generateRandomLetter();
		
		Boolean userWins = false;
		
		// q - quit program
		while (userWins == false) {
			System.out.print("Enter guess as a lowercase letter from a through z:  ");
			String userCmd = kybd.next();
			// Compare answer to guess
			int compareGuessToAnswer = GuessALetterUtils.compareTo(systemRandomLetter, userCmd);
			
				if (compareGuessToAnswer == 1) {
					System.out.println("\nMove to the right in the alphabet.");
				}
				else if (compareGuessToAnswer == -1) {
					System.out.println("\nMove to the left in the alphabet.");
				}
				else {
					System.out.println("\nThe system randomly selected: " + systemRandomLetter);
					System.out.println("You have guessed correctly!");
					userWins = true;
				}
		}

	}

}

