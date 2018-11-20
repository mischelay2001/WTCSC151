
public class LinesTriangleOfSquares {

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
		int largestIndex = testEntry - 1; // largest index of request by user
		//int rowLength = testEntry * largestIndex; // Ex: 6 * 5 = 30
		String leftIndexString = "";  // characters before the index
		int leftStringLength = 0;
		String rightIndexString = ""; // characters after the index 
		int rightStringLength = 0;
		int indexValue;
		int charactersBefore = 0;
		String rowString = "";
		int indexMath = 0;
		int spaceMultiple = 5;
		
		
		// Loop to build power string
		String indexString = "";
		for (int a = 1; a <= testEntry; a++) {
			indexString += a;
		} // End for: indexString

		
		for (int rowLength = (testEntry * largestIndex); rowLength > 0; rowLength--) {
			// Loop to iterate index string
			for (int index = largestIndex; index >= 0; index--) {
				// Test if index is 1 or 2 digits
				indexValue = Character.getNumericValue(indexString.charAt(index));
				
				if (indexValue > 9) {
					charactersBefore = 4;
				}
				else charactersBefore = 3;
				
				leftStringLength = (int) (charactersBefore + (spaceMultiple * (largestIndex - (largestIndex - 1))));
				System.out.print(leftStringLength);
				
				// Ex: leftStringLength = 5
				while(leftStringLength > 0) {
					System.out.print("*");
					leftIndexString += "*";
					leftStringLength--;
				} // End while: leftStringLength
				System.out.println("\nLeft String: " + leftIndexString);
				
				
				rightStringLength = rowString.length() - leftStringLength;
				System.out.print("right string " + rightStringLength);
			} // End for: index
			
			
			// Calculate the index raised to 2nd power
			//indexMath = Character.getNumericValue(indexString.charAt(index));
			//indexMath = (int) Math.pow(indexMath, 2);
			
		} // End for: rowLength
		
		
		
		// Loop to control rows
		//for (int row = 1; row <= largestIndex; row++) {
			

				
				// Build row
				//rowString = leftIndexString + charactersBefore + rightIndexString;
				
		//	} // End for: row
		//} // End for: index

		

	} // End static

} // End class
