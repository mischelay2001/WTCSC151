public class NewTriangleOfSquares {
	public static void main(String[] args) {
		/** Write a program using a Scanner that asks the user for a number n between 1 and 9 (inclusive).  
		 * The program prints a triangle with n rows.  The first row contains only the square of 1, and it is right-justified.  
		 * The second row contains the square of 2 followed by the square of 1, and is right justified.  
		 * Subsequent rows include the squares of 3, 2, and 1, and then 4, 3, 2 and 1, and so forth until n rows are printed.
		 */
		System.out.print("Enter a number from 1 through 9: " + "\n");
		// Get user entry number 1 through 9
		//Scanner rawInput = new Scanner(System.in);	
		//int userEntry = rawInput.nextInt();
		int testEntry = 6;
		// Define Variables
		testEntry++;
		
		// Loop to build power string
		String indexString = "";
		for (int a = 1; a <= testEntry; a++) {
			indexString += a;
		}
		System.out.println(indexString);
		
		// Determine largest number of indexes; 
		// User entry = 6, largest index = 5 
		int largestNumOfIndexes = testEntry - 1;
		String blankSpaces = "*****";
		int numOfBlankSpaces = largestNumOfIndexes - 1;
		int indexMath = 0;
		// Start index at 0
		int nextIndex = 0;
		String keepEachRow = "";
		String currentRow = "";
		
		// Loop to control the number of rows
		for (int row = 1; row <= testEntry - 1; row++) {		
			// Loop to print necessary number of blanks
			// User entry = 6, largest index = 5, number of blank spaces = 4 
			if (numOfBlankSpaces > 0) {
				// Print blanks user entry - 1 times
				// Ex: if user enters 6, print 5 * blank spaces, decreasing
				while (numOfBlankSpaces > 0) {
					System.out.print(blankSpaces);	
					numOfBlankSpaces--;	
				} // End while numOfBlankSpaces
			} // End if numOfBlankSpaces
			// Take number at index and raise it to 2nd power
			indexMath = Character.getNumericValue(indexString.charAt(nextIndex));
			indexMath = (int) Math.pow(indexMath, 2);
			System.out.print(indexMath + "\n");
			currentRow += blankSpaces + indexMath;
			
			nextIndex++;
			largestNumOfIndexes--;
			
			//System.out.println("Keep: " + keepEachRow);
			// Reset the number of blank spaces
			numOfBlankSpaces = largestNumOfIndexes - 1;
			System.out.println("Keep: " + keepEachRow);
		} // End for each row
		keepEachRow += blankSpaces + indexMath;
	
	}
}