import java.util.Scanner;

public class FavSchool {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);

		String favSchool = "unknown";

		System.out.println("Enter 1 for white, 2 for gold, 3 for orange");
		int choice1 = kybd.nextInt();

		if (choice1 == 1) {
			System.out.println("enter 1 for light blue, 2 for purple, 3 for red, 4 for dark blue ");
			int choice2 = kybd.nextInt();
			// if the user chooses light blue, the favorite school is UNC
			// if the user chooses purple, the favorite school is Furman
			// if the user chooses red, the favorite school is <you guess>
			// if the user chooses dark blue, the favorite school is <whatever>
			
		} else if (choice1 == 2) {
			// System.out.println("enter 1 for blue, 2 for black ");
			// gold and blue are Wake Tech
			// gold and black are Wake Forest
			
		} else {
			System.out.println("enter 1 for blue, 2 for purple ");
			// orange and blue are UVA
			// orange and purple are Clemson
			
		}
		
		System.out.println("Favorite school is " + favSchool);

	}

}
