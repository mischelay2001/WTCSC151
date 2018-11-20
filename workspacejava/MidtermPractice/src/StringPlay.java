import java.util.Scanner;

public class StringPlay {

	public static void main(String[] args) {
		String current = "";
		Scanner kybd = new Scanner(System.in);
		
		System.out.println("Enter e(enter current string), pl(pad left), pr(pad right), zl(zap left), zr(zap right), x(exit)");
		String userCmd = kybd.next();
		while (!userCmd.equals("x")) {
			
			if (userCmd.equals("e")) {
				System.out.print("Enter the new current String: ");
				current = kybd.next();
			} else if (userCmd.equals("pl")) {
				System.out.print("How many chars to add? ");
				int numToAdd = kybd.nextInt();
				System.out.println("What char to use? ");
				char charToAdd = kybd.next().charAt(0);
				current = StringUtils.padLeft(current, numToAdd, charToAdd);
			} else if (userCmd.equals("pr")) {
				System.out.print("How many chars to add? ");
				int numToAdd = kybd.nextInt();
				System.out.println("What char to use? ");
				char charToAdd = kybd.next().charAt(0);
				current = StringUtils.padRight(current, numToAdd, charToAdd);
			} else if (userCmd.equals("zl")) {
				System.out.print("How many chars to zap? ");
				int zapp = kybd.nextInt();
				current = StringUtils.zapLeft(current, zapp);
			} else if (userCmd.equals("zr")) {
				System.out.print("How many chars to zap? ");
				int zapp = kybd.nextInt();
				current = StringUtils.zapRight(current, zapp);
			} 
			System.out.println("The current string is: " + current);
			System.out.println("Enter e(enter current string), pl(pad left), pr(pad right), zl(zap left), zr(zap right), x(exit)");
			userCmd = kybd.next();
		}

	}

}
