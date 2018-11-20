import java.util.*;
public class Quiz5_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
//		String [] input = {"a", "b", "c", "d"};
//

		String [] allLines = {};
		Boolean moreLines = true;
		String aLine = null;
		int loopCount = 0;

		while (moreLines == true) {
			aLine = input.nextLine();
			// Read each element, add to a new array of all lines plus a space
			allLines[loopCount] = (aLine + " ");
	
			if (input.hasNextLine() == false) {
				moreLines = false;
			}
			
			loopCount++;
		}
		
		System.out.print(allLines);
		input.close();
		
	}

}
