import java.util.*;

public class TriangleOfSquares {

	public static void main(String[] args) {
		/** Write a program using a Scanner that asks the user for a number n between 1 and 9 (inclusive).  
		 * The program prints a triangle with n rows.  The first row contains only the square of 1, and it is right-justified.  
		 * The second row contains the square of 2 followed by the square of 1, and is right justified.  
		 * Subsequent rows include the squares of 3, 2, and 1, and then 4, 3, 2 and 1, and so forth until n rows are printed.
		 */

		int[] squaresArray = {1,4,9,16,25,36,49,64,81};
		
		System.out.print("Enter a number from 1 through 9: ");

		Scanner rawInput = new Scanner(System.in);	
		int userEntry = rawInput.nextInt();
		
		int[] subSquaresArray = new int[userEntry]; //Ex: 5
		int[] reverseSubSquaresArray = new int[userEntry];
		
		// Fill substring 
		// Run for loop to obtain index 0 thru 1 before index[userEntry]; Ex: (less than 5) --> [0] thru [4] 
		for (int j = 0; j < (userEntry); j++) {
			subSquaresArray[j] = squaresArray[j];
		}

		// Fill reverse substring
		String keepIndexes = "";
		String blankSpace = " ";
	
		int maxIndex = userEntry - 1; //Ex: 5 - 1 = 4
		for (int m = 0; m < (userEntry); m++) { //Ex: [0] thru [4]
			reverseSubSquaresArray[m] = subSquaresArray[maxIndex];
			keepIndexes += reverseSubSquaresArray[m] + blankSpace;
			maxIndex--;
		}
		
		
		// Print Triangle
		//int rowBlankControl = userEntry - 1;
		// Number of rows equal user Entry Ex: 5
		// Run for loop to print number of rows
		
		
		
		
		
		
		/** for (int rows = 1; rows <= userEntry; rows++) {
			
			// Run loop for each row
			
			int rowIndexEnd = userEntry + (userEntry - 2);
			int rowIndexStart = rowIndexEnd - 1;
			
			int[] subArray = Arrays.copyOfRange(reverseSubSquaresArray, rowIndexStart, rowIndexEnd);
			
			// Print print the span of indexes Ex: Row 1 [lastIndex], Row 2 [lastIndex-1] [lastIndex]
			for (int numRowIndex = 1; numRowIndex < reverseSubSquaresArray.length; numRowIndex++) {
				
				for (int subArrayCount = 0; subArrayCount < subArray.length; subArrayCount++) {
					System.out.printf( "%8s", subArray);
				}
				
				rowIndexStart +=2;
			}
		}
			*/
			
			//for (int rowBlanks = rowBlankControl; rowBlanks > 0; rowBlanks--) {
			//}
			//rowBlankControl--;
		
		
		System.out.printf("Keep Indexes: " + "%8s", keepIndexes);
		System.out.println("Length SubSquares: " + reverseSubSquaresArray.length);	
		System.out.println("Length keep Index: " + keepIndexes.length());	
		
		/**		int rowIndexEnd = subArray.length;
		int rowIndexStart = rowIndexEnd - 1;);
		
		
		int rowIndexEnd = subArray.length;
		int rowIndexStart = 0;
		
		int[] subArray = Arrays.copyOfRange(reverseSubSquaresArray, rowIndexStart, rowIndexEnd);
			for(int i = 0; i < subArray.length; i++) {
				System.out.println("Sub " + subArray.length);
				//System.out.printf( "%8s", subArray[0]);
			}
	*/
		// Close Scanner
		rawInput.close();
	}

}
