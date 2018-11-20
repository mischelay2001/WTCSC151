import java.lang.Math;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Unit05FlashCard {

	public static void main(String[] args) {

		// Program displays a WidgetViewer GUI
		WidgetViewer wv = new WidgetViewer();
		
		/** your program should use a Random object to generate two random numbers between 0 and 9 (inclusive).
		To explain the operation of this program, we'll assume that our random number generator generated 6 and 3.

		The user should put his or her guess in the JTextField and click the JButton.  
		When the button is clicked, the program should get the text from the JTextField, convert it from String to int, and create a JLabel that says either
		That's right.  Good Job, or
		Sorry, the correct answer is 18
		depending on whether the user input the correct number (18 in this case).*/
		
		// Program should use a Random object to generate two random numbers between 0 and 9 (inclusive).
		int randomNumber1 = (int)(Math.random() * 10);
		int randomNumber2 = (int)(Math.random() * 10);
		
		// Control random numbers are between 0 and 9
		if (randomNumber1 > 9) {
			randomNumber1 -= 1;
		}
		
		if (randomNumber2 > 9) {
			randomNumber2 -= 1;
		}
		
		// Find the product
		int productOfNumbers = randomNumber1 * randomNumber2;
				
		// Program displays a JLabel asking the user to enter the product of the two random numbers
		// String userEntry = null;
		
        JLabel jluserProduct = new JLabel("What is the product of " + randomNumber1 + " and " + randomNumber2 + ": ");
        wv.add(jluserProduct, 10, 30, 300, 20);
          
        // Capture the product input from user as JTextField.  It will reflect what the user entered.
        JTextField jtfuserProduct = new JTextField();
        wv.add(jtfuserProduct);
        
        JButton jbuserProduct = new JButton("Click Here to confirm your answer.");
        wv.addAndWait(jbuserProduct);

        String userEntry = jtfuserProduct.getText();
        
        // Convert user entry into an integer
        int userProduct = Integer.parseInt(userEntry);
        
        // Evaluate the user's product against the calculated product
        if (userProduct == productOfNumbers) {
            JLabel jlAnswerMessage = new JLabel("YOU ARE CORRECCT!!!");
            wv.add(jlAnswerMessage, 10, 100, 300, 20);
        }
        else {
        	JLabel jlAnswerMessage = new JLabel("INCORRECT  " + productOfNumbers + " is the correct answer.");
        	wv.add(jlAnswerMessage, 10, 100, 300, 20);
        }

	}

}
