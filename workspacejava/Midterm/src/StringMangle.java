import java.util.Scanner;

public class StringMangle {

	public static void main(String[] args) {

		/**StringMangle
		You are to write a class StringMangle that has only a main method.  
		This program allows a user to enter a String that we’ll call currentString.  */
		String current = "";
		Scanner kybd = new Scanner(System.in);
		
		// Title and Menu
		System.out.println("STRING MANGLE MENU");

		// Instructions
		System.out.print("Enter a string of characters to mangle: ");
		current = kybd.next();
				
		/** It maintains another String that we’ll call clipboard.  The program asks the user to enter currentString.  
		It then uses a sentinel-controlled loop to ask the user to enter one of four commands: */
		System.out.println('\n' + "c:  Captures portion of string entered.");
		System.out.println("x:  Truncates string entered.");
		System.out.println("v:  Inserts a new string to string entered.");
		System.out.println("q:  Exit program");
		
		System.out.print('\n' + "Enter the corresponding letter for selection:  ");
		String userCmd = kybd.next();
		String clipBoard = "";
		int currentLastPosition = current.length();
		
		// q - quit program
		while (!userCmd.equals("q")) {
	
			if (userCmd.equals("c")) {
				//c – copies part of currentString into clipboard using the copy method above.  
				// It asks the user for the starting and one-past the ending positions in currentString.

				System.out.print("Enter the starting point:  ");
				int startPoint = kybd.nextInt();
				clipBoard = StringUtils.copy(current, startPoint, currentLastPosition - 1);
								
				// x – assigns a new value to currentString using the cut method above.  
				// It asks the user for the starting and one-past the ending positions in currentString.
			} else if (userCmd.equals("x")) {
				System.out.print("Enter the starting point:  ");
				int startPoint = kybd.nextInt();
				clipBoard = StringUtils.cut(current, startPoint, currentLastPosition);
					
				// v – assigns a new value to currentString using the paste method above to insert the clipboard into currentString.
				// It asks the user for the starting position in currentString.
			} else if (userCmd.equals("v")) {
				System.out.print("Enter the position of where an additional string will be inserted:  ");
				int startPoint = kybd.nextInt();
				System.out.print("Enter the string to insert:  ");
				String stringToInsert = kybd.next();
				clipBoard = StringUtils.paste(current, startPoint, stringToInsert);
			}
				
			// Output
			System.out.println("The original string:  " + current);
			System.out.println("Original string per selection:  " + clipBoard);
			System.out.println('\n' + "Choose a selection and enter the corresponding letter." + '\n');
			
			/** It maintains another String that we’ll call clipboard.  The program asks the user to enter currentString.  
			It then uses a sentinel-controlled loop to ask the user to enter one of four commands: */
			System.out.println("c:  Copies part of currentString into clipboard");
			System.out.println("x:  Assigns a new value to currentString");
			System.out.println("v:  Assigns a new value to currentString using the paste method above to insert the clipboard into currentString");
			System.out.println("q:  Exit program");
			userCmd = kybd.next();
		}

	}

}
