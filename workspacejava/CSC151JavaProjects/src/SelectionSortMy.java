public class SelectionSort {

	public static void main(String[] args) {

		double testArray[] = {5.2,8.5,7.9,9.4,6.8,2.6,4.3};
		selectionSort(testArray);
		//int num_Elements = 10;

//		System.out.println("\nlo2Hi");
//		double lo2Hi[] = new double[num_Elements];
//		// Fill lo2Hi array
//		for (int fillIndex = 0; fillIndex <= num_Elements - 1; fillIndex++) {
//			double addToArray = (fillIndex + 1) * 1.0;
//			lo2Hi[fillIndex] = addToArray;
//			System.out.print(lo2Hi[fillIndex] + " - ");
//		}
//		selectionSort(lo2Hi);

	} // Close main

	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {

		boolean jLessThanLength = false;
		boolean currentMinNotI = false;
		int comparisons = 0;
		int dataSwaps = 0;
		int outerLoopCount = 0;

		System.out.println("\nOuter For Loop");
		for (int i = 0; i < list.length - 1; i++) {

			// Find the minimum in the list[i..list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			System.out.println("\n  1st For Loop");

			while(jLessThanLength != true) {

				for (int j = i + 1; j < list.length; j++) {
					
					// Comparison
					comparisons++;
					
					if (currentMin > list[j]) {
						currentMin = list[j];
						currentMinIndex = j;
	
					} // Close if currentMin > list[j]
					
					if(j >= list.length) {
						jLessThanLength = true;
					}
	
					System.out.println("    j: " + j + " List j: " + list[j] + " comparisons: " + comparisons);
	
				} // Close for j < list.length
				

			}// Close while j less than length

			System.out.println("\n      i: " + i + " List i: " + list[i] + " currentMin: " + currentMin
					+ " currentMinIndex: " + currentMinIndex + " comparisons: " + comparisons);

			while (currentMinNotI != true) {

				// Swap list[i] with list[currentMinIndex] if necessary;
				if (currentMinIndex != i) {
					list[currentMinIndex] = list[i];
					list[i] = currentMin;
	
					// Comparison
					comparisons++;
					// Data Swap
					dataSwaps++;
					
					if (currentMinIndex = i) {
						currentMinNotI = true;
					} // Close if currentMinIndex = i
				} // Close if currentMinIndex != i
			}// Close while currentMinNotI
		} // Close for i < list.length - 1
	} // Close selectionSort method
} // Close SelectionSort class
