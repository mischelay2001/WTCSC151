public class temp{

	public static void main(String[] args) {

		/**
	
		Write a class, AverageCalculatorMain that contains a main method and does the following: 
		
		create a AverageCalculator object, add one number to the AverageCalculator (pick whatever value you wish), 
		and print the sum, count and average of the AverageCalculator .
		create another AverageCalculator object.  Add three numbers to the AverageCalculator , and print the sum, 
		count and average of the AverageCalculator .
		 */
		
		AverageCalculator mvResults = new AverageCalculator();
		
		mvResults.add(12);
	
		int mvCount = mvResults.getCount(); //call get count
		int mvSum = mvResults.getSum(); //call get sum
		double mvAverage = mvResults.getAverage(); //call get average
		System.out.println("Count of numbers were captured: " +  mvCount);
		System.out.println("Sum of the " + " numbers: " + mvSum);
		System.out.println("Average of the " + " numbers: " + mvAverage);
			
			//System.out.println("Enter the count of the numbers to be captured: ");
		
	}
}

