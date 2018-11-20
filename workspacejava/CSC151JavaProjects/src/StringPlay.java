import java.util.*;

public class StringPlay {

	public static void main(String[] args) {
			
		// Define Variables
		
		String userEntry;
		String userEntryTrimmed;
		String userEntryFirst3;
		String userEntryLast4;
		String userEntryMiddle;
		String userEntryLast4First3Swap;
		String userEntryUpperCase;
		String userEntryLowerCase;
		String userEntryFirstHalf;
		String userEntrySecondHalf;
		
		//Invoke Scanner
		Scanner kybd = new Scanner(System.in);
		
		//Obtain user entry
		System.out.println("Enter a line of text at least 7 characters long");
		userEntry = kybd.nextLine();
	
		// Look for leading and trailing white spaces
		userEntryTrimmed = userEntry.trim();
		System.out.println("\nUser entry has been trimmed of leading and trailing white spaces: " + userEntryTrimmed);
		
		/* Concatenate as a new string as first 3 characters as the last characters 
		and the last 4 characters will become the first */
		  
	  	// Find the length of userEntry
	  	int userEntryLastIndex = userEntryTrimmed.length() - 1;
	  	System.out.println("\nNumber of characters in user entry: " + userEntryLastIndex);
	  	
		// Find first 3 letters in userEntry
		userEntryFirst3 = userEntryTrimmed.substring(0, 3);
		System.out.println("\nFirst 3 characters of user entry: " + userEntryFirst3);
	
		// Find last 4 letters in userEntry
		userEntryLast4 = userEntryTrimmed.substring(userEntryLastIndex - 3);
		System.out.println("Last 4 characters of user entry: " + userEntryLast4);
		
		// Find remaining characters in between first 3 and last 4
		userEntryMiddle = userEntryTrimmed.substring(3, userEntryLastIndex - 3);
		
		if (userEntryMiddle.length() < 0) {
			System.out.println("Characters in between: " + userEntryMiddle);
		}
		else System.out.println("Characters in between: None");
		
		// Concatenate new string with last 4 + middle characters + first3
		userEntryLast4First3Swap = userEntryLast4 + userEntryMiddle + userEntryFirst3;
		
		System.out.println("\nLast 4 characters are now leading: " + userEntryLast4);
		System.out.println("First 3 are now trailing: " + userEntryFirst3);
		System.out.println("\nUser entry as been modified as: " + userEntryLast4First3Swap);
	
		// Convert userEntry to all uppercase
		userEntryUpperCase = userEntry.toUpperCase();
		System.out.println("\nUser entry as all uppercase: " + userEntryUpperCase + "\n");
		
		// Convert userEntry to all lowercase and compare against userEntry
		userEntryLowerCase = userEntryTrimmed.toLowerCase();

		if (userEntryTrimmed == userEntryLowerCase) {
			System.out.println("User entry was entered as all lowercase: " + userEntryLowerCase);
		}	
		else {
			System.out.println("User entry was not entered as all lowercase: " + userEntryLowerCase);
		}
		
		// Find first half and last half of userEntry and determine if they are equivalent
		int userEntryLength = userEntryTrimmed.length();

		int midPoint = 0;
		
		if (userEntryLength % 2 != 0) {
			midPoint = (int) (Math.ceil(userEntryLength / 2.0)); 
		}
		else {
			midPoint = userEntryLength / 2;
		}
		
		userEntryFirstHalf = userEntryTrimmed.substring(0, midPoint);
		userEntrySecondHalf = userEntryTrimmed.substring(midPoint);
		
		System.out.println("\nMid-point character: \"" + userEntryTrimmed.charAt(midPoint - 1) + "\" at position: " + midPoint);
		System.out.println("First half of string: " + userEntryFirstHalf);
		System.out.println("Second half of string: " + userEntrySecondHalf + "\n");
		
		if (userEntryFirstHalf.equals(userEntrySecondHalf)) {
			System.out.println("The first and second halves are equivalent.");
		}
		else System.out.println("The first and second halves are not equivalent.");
		
		kybd.close();
	}

}
