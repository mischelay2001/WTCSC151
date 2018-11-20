/** Create a program asking whether the parents are visiting, 
 * whether the weather is good, and whether you are rich or poor.  
 * Your program should print "go to the cinema" "go shopping" or "stay in" as appropriate. 
 */

/**
 * @author Michele Johnson
 *
 */
// Import Statements
import java.util.Scanner; // Scanner is in the java.util package

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input  = new Scanner(System.in);
		
		// Assign Constant Variables
		String cinema = "go to the cinema.";
		String shop = "go shopping."; 
		String stayIn = "stay in.";

		// Display prompts to user
		System.out.print("Enter a year: ");
		int userYear = input.nextInt();
		
		int userRichOrPoor = input.nextInt();
		
		// Determine if user entered a leap year
		(userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0)

		
		// Parents Visiting
			// If yes, then going to the movies regardless of weather or finances
			if (userParentVisiting == 1) {
				System.out.print("Your parents are visiting so, we will " + cinema);
			}
			
			// Else, parents are not visiting
			else {
				System.out.print("Your parents are not visiting, ");
				
				// Shopping: if weather is good and rich: 
				// If Rich, shopping
				if (userGoodWeather == 1 && userRichOrPoor == 1) {
					System.out.print("the weather is good, ");
					System.out.print("and money is not an issue; ");
					System.out.print("we will " + shop);
				}

				// Movies: 
				// if weather is good AND if money is an issue
				if (userGoodWeather == 1 && userRichOrPoor == 2) {
						System.out.print("the weather is good, ");
						System.out.print("and money is an issue; ");
						System.out.print("we will " + cinema);
				}
				
				// if weather is bad AND if money is not an issue
				else if (userGoodWeather == 2 && userRichOrPoor == 1) {
						System.out.print("the weather is bad, ");
						System.out.print("and money is not an issue; ");
						System.out.print("we will " + cinema);
				}
				
				// Stay In: if weather is bad and money is an issue
				if (userGoodWeather == 2 && userRichOrPoor == 2) {
					System.out.print("the weather is bad, ");
					System.out.print("and money is an issue; ");
					System.out.print("we will " + stayIn);
				}
						
		// Close Scanner
		input.close();
			}
	}
}