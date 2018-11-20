public class SelectionSort {

	public static void main(String[] args) {

		int num_Elements = 4000;

		System.out.println("\nlo2Hi");
		double lo2Hi[] = new double[num_Elements];
		// Fill lo2Hi array
		for (int fillIndex = 0; fillIndex <= num_Elements - 1; fillIndex++) {
			double addToArray = (fillIndex + 1) * 1.0;
			lo2Hi[fillIndex] = addToArray;
			// System.out.print(lo2Hi[fillIndex] + " - ");
		}
		selectionSort(lo2Hi);

		System.out.println("\nhi2Lo");
		int highStart = 24;
		double hi2Lo[] = new double[num_Elements];
		// Fill hi2Lo array
		for (int fillIndex = 0; fillIndex <= num_Elements - 1; fillIndex++) {
			double addToArray = highStart * 1.0;
			hi2Lo[fillIndex] = addToArray;
			highStart--;
			// System.out.print("\n" + hi2Lo[fillIndex] + " - ");
		}
		selectionSort(hi2Lo);

		System.out.println("\nRandom");
		double random[] = new double[num_Elements];
		// Fill random array
		for (int fillIndex = 0; fillIndex <= num_Elements - 1; fillIndex++) {
			double addToArray = Math.random();
			random[fillIndex] = addToArray;
			// System.out.printf("\n %.2f %s", addToArray, " - ");
		}
		selectionSort(random);
	} // Close main

	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {

		int comparisons = 0;
		int dataSwaps = 0;

		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {

				comparisons++;
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				// Data Swap
				dataSwaps++;
			}

		}
		// Comparison
		comparisons++;
		System.out.println("Comparisons: " + comparisons + " Swaps: " + dataSwaps);

	}
}
