import java.util.Scanner;

public class Chapter07_HLIIGTT {
	
	/**
	Start with the SelectionSort class in the zip file attached to this item.  
	Keep the name SelectionSort, and add a main method to it.
	•	Modify the selectionSort method to have two counters, one for the number of comparisons, 
	and one for the number of data swaps. Each time two data elements are compared 
	(regardless of whether the items are in the correct order—we're interested in that a comparison is being done at all), 
	increment the comparison counter.  Each time two data items are actually swapped, increment the data swap counter.
	•	At the end of the selectionSort method, print the size of the sorted array, and the counters.  
	(Be sure to identify which counter is which in your print message
	•	In your main method, 
	o	Declare a final int, NUM_ELEMENTS.  Initially set NUM_ELEMENTS to 10 to debug your program.
	o	Declare and create three double arrays of NUM_ELEMENTS length, lo2Hi, hi2Lo, random.
	o	Initialize the first array, lo2Hi, with values 1.0, 2.0, …, NUM_ELEMENTS
	o	Initialize the second array, hi2Lo with values NUM_ELEMENTS, 24.0,…, 1.0
	o	Initialize the third array, random, with random double values between 0.0 and less than 1.0
	o	call the selectionSort method using each array.  
		(Note:  you might want to print the array elements themselves for debugging purposes when NUM_ELEMENTS is small, 
		but you’ll not want to print them with larger values for NUM_ELEMENTS.)
	•	Run your program three times with different values for NUM_ELEMENTS: 1000, 2000 and 4000.

	*/

	public class SelectionSort {

		public static void main(String[] args) {
			
			//double testArray[] = {5.2,8.5,7.9,9.4,6.8,2.6,4.3};
			//selectionSort(testArray);
			
			int num_Elements = 10;
			
			System.out.println("\nlo2Hi");
			double lo2Hi[] = new double[num_Elements];
			// Fill lo2Hi array
			for (int fillIndex = 0; fillIndex <= num_Elements - 1; fillIndex++) {
				double addToArray = (fillIndex + 1) * 1.0;
				lo2Hi[fillIndex] = addToArray;
				System.out.print(lo2Hi[fillIndex] + " - ");
			}
			selectionSort(lo2Hi);
			
//			System.out.println("\nhi2Lo");
//			int highStart = 24;
//			double hi2Lo[] = new double[num_Elements];
//			// Fill hi2Lo array
//			for (int fillIndex = 0; fillIndex <= num_Elements - 1; fillIndex++) {
//				double addToArray = highStart * 1.0;
//				hi2Lo[fillIndex] = addToArray;
//				highStart--;
//				System.out.print("\n" + hi2Lo[fillIndex] + " - ");	
//			}
//			selectionSort(hi2Lo);
//			
//			System.out.println("\nRandom");
//			double random[] = new double[num_Elements];
//			// Fill random array
//			for (int fillIndex = 0; fillIndex <= num_Elements - 1; fillIndex++) {
//				double addToArray = Math.random();
//				random[fillIndex] = addToArray;
//				System.out.printf("\n %.2f %s", addToArray, " - ");				
//			}
//			selectionSort(random);	
		}  // Close main
			
		/** The method for sorting the numbers */
		public static void selectionSort(double[] list) {
			int comparisons = 0;
			int dataSwaps = 0;
			int outerLoopCount = 0;
			
			for (int i = 0; i < list.length - 1; i++) {
				// Find the minimum in the list[i..list.length-1]
				System.out.println("\nOuter For Loop");
				double currentMin = list[i];
				int currentMinIndex = i;
			
				System.out.println("  i: " + i + " List i: " + list[i] + " currentMin: " + currentMin + " currentMinIndex: " + currentMinIndex);
				for (int j = i + 1; j < list.length; j++) {
					if (currentMin > list[j]) {
					    currentMin = list[j];
					    currentMinIndex = j;
					    // Comparison
					    comparisons++;
					    System.out.println("    j: " + j + " List j: " + list[j]);
					    //System.out.format("\nList: %.2f %s", list[j], " currentMin: ", currentMin, " currentMinIndex: ");
					} // Close if currentMin > list[j]
				} // Close for j < list.length
				
				// Swap list[i] with list[currentMinIndex] if necessary;
				if (currentMinIndex != i) {
					list[currentMinIndex] = list[i];
					list[i] = currentMin;
				    // Comparison
				    comparisons++;
				    // Data Swap
					dataSwaps++;
					//System.out.format("\nList: %.2f %s", list[i], " currentMin: ", currentMin, " currentMinIndex: ", currentMinIndex, " Data Swaps: ", dataSwaps);
				} // Close if currentMinIndex != i
			outerLoopCount++;
			System.out.println("\n   List:" + list[i] + " currentMin: " + currentMin);
			}  // Close for i < list.length - 1
			System.out.println("\nOuter loop count: " + outerLoopCount);
				
		} // Close selectionSort method
		
	} // Close SelectionSort class





