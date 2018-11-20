
public class LoopsTriangleOfSquares {

	public static void main(String[] args) {
		/** Write a program using a Scanner that asks the user for a number n between 1 and 9 (inclusive).  
		 * The program prints a triangle with n rows.  The first row contains only the square of 1, and it is right-justified.  
		 * The second row contains the square of 2 followed by the square of 1, and is right justified.  
		 * Subsequent rows include the squares of 3, 2, and 1, and then 4, 3, 2 and 1, and so forth until n rows are printed.
		 */
		//System.out.print("Enter a number from 1 through 9: " + "\n");
		// Get user entry number 1 through 9
		//Scanner rawInput = new Scanner(System.in);	
		//int userEntry = rawInput.nextInt();
		int testEntry = 6;
		// Define Variables
		
		// Determine largest number of indexes; 
		// User entry = 6, largest index = 5 
		int largestNumOfIndexes = testEntry - 1;
		int blankSpaceMultiple = largestNumOfIndexes;
		
		// Determine number of spaces needed for each row
		// Ex: largest index = 5, number of spaces = largest * multiple
		
		int numOfBlankSpaces = largestNumOfIndexes * blankSpaceMultiple;
		int numOfBlankSpacesAfter = 1;
		
		// Loop to build power string
		String indexString = "";
		for (int a = 1; a <= testEntry; a++) {
			indexString += a;
		}
		
		int indexPosition = 0;
		int indexPositionAfter = 1;
		int indexMath = 0;
		
		String leftString = "";
		String rightString = "";
		
		for (int row = 1; row <= testEntry; row++) {
			System.out.println(numOfBlankSpaces);
			while (numOfBlankSpaces > 0) {
				System.out.print("*");
				leftString += "*";
				numOfBlankSpaces--;
			}// End of while loop: numOfBlankSpaces
			
			// Calculate the index raised to 2nd power
			indexMath = Character.getNumericValue(indexString.charAt(indexPosition));
			indexMath = (int) Math.pow(indexMath, 2);
			System.out.print(indexMath);
			
				// Loop to stack the string index
				if (indexPositionAfter > 1 && indexPositionAfter < largestNumOfIndexes) {
					numOfBlankSpacesAfter = (blankSpaceMultiple - 1);
					while (numOfBlankSpacesAfter > 0) {
						System.out.print("*");
						numOfBlankSpacesAfter--;
					}// End of while loop: numOfBlankSpacesAfter
					System.out.print(indexString.charAt(indexPositionAfter - 1));
					
					// Reset number of spaces
					//System.out.println();
					//indexPosition++;
					//System.out.println(largestNumOfIndexes);
					//numOfBlankSpacesAfter = blankSpaceMultiple - 1;
					indexPositionAfter--;
					
				}// End of if: index position greater than 1
			
			
			// Reset number of spaces
			System.out.println();
			largestNumOfIndexes--;
			//System.out.println(largestNumOfIndexes);
			numOfBlankSpaces = largestNumOfIndexes * blankSpaceMultiple;
			indexPosition++;
			//System.out.println(numOfBlankSpaces);
		}// End of for loop: row
	}

}
