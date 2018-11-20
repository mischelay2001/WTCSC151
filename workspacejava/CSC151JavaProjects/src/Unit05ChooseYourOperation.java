import java.lang.Math;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Unit05ChooseYourOperation {

	public static void main(String[] args) {

		// Program displays a WidgetViewer GUI
		WidgetViewer wv = new WidgetViewer();
		
		// Write a program that uses a WidgetViewer object to do the following:  
				
		// Program should use a Random object to generate two random numbers between 0 and 9 (inclusive).
		// Generate two random integers between 1 and 9 (inclusive).  Name one of them x, the other y. 
		int x = (int)(Math.random() * 10);
		int y = (int)(Math.random() * 10);
		
		// Control random numbers are between 0 and 9
		if (x > 9) {
			x -= 1;
		}
		
		if (y > 9) {
			y -= 1;
		}
		
		// Display x and y to the user using JLabel objects.
        JLabel jlMessage= new JLabel("Random numbers generated: ");
        wv.add(jlMessage, 10, 30, 300, 20);
        
        JLabel jlNumberX = new JLabel("X: " + x);
        wv.add(jlNumberX, 10, 45, 300, 20);
        
        JLabel jlNumberY = new JLabel("Y: " + y);
        wv.add(jlNumberY, 10, 60, 300, 20);
        
        // Display user instructions; Create a JLabel object displaying the text "Enter an operation number."
        JLabel jlUserInstructions = new JLabel("Select an operation by entering an integer. ");
        wv.add(jlUserInstructions);
        
        // Create a JTextField for the user's input.
        // Capture the product input from user as JTextField.  It will reflect what the user entered.
        JTextField jtfUserEntry = new JTextField();
        wv.add(jtfUserEntry);
        
        // Create a JButton displaying the text "Press here when you've entered your operation."  
        // Use addAndWait to add it to the WidgetViewer object.
        JButton jbUserEntry = new JButton("Click Here to confirm your selection.");
        wv.addAndWait(jbUserEntry);
        
        // Capture user entry as a string
        String userEntry = jtfUserEntry.getText();
        
        // Convert user entry into integer
        int operationSelected = Integer.parseInt(userEntry);
        
		// When the user clicks the JButton, evaluate operation in the following order to determine the one and only 
        // mathematical operation to perform on x and y. 
        // Note:  Operation can be negative or zero.
        
        int operationResult = -999;
        double floatOperationResult = -999.9;
        Boolean messageFloat = false;
        
		// If operation is between 1 and 10 inclusive, add x and y.  
        if (operationSelected >= 1 && operationSelected <=10) {
        	operationResult = x + y;
        }
        // If operation is evenly divisible by 4, subtract y from x.
        else if (operationSelected % 4 == 0) {
        	operationResult = y - x;
        }
        // If operation is evenly divisible by 5, use integer division to divide y into x. 
        else if (operationSelected % 5 == 0) {
        	operationResult = x / y;
        }
        // If operation is an even number, use floating point division  to divide y into x.  
        else if (operationSelected % 2 == 0) {
        	floatOperationResult = (float)y / (float)x;
        	messageFloat = true;
        }
        // If none of the other tests on operation apply, multiply x and y.
        else {
        	operationResult = x * y;
        }
		
		// Use a JLabel to display the result.
        
        if (messageFloat == true) {
            JLabel jlResultMessage = new JLabel("The result of the operation selected: " + floatOperationResult);
            wv.add(jlResultMessage, 10, 150, 300, 20);
        }
        else {
            JLabel jlResultMessage = new JLabel("The result of the operation selected: " + operationResult);
            wv.add(jlResultMessage, 10, 150, 300, 20);
        }
        
	}

}
