
public class AverageCalculator {	
	
	// Variables
	//int clsNewNumber = 0;
	private int clsCount = 0;
	private int clsSum = 0;
	double clsAverage = 0;
		
	// Method:  Constructor - no argument constructor
	public AverageCalculator () {
		int clsNewNumber = add();
		clsSum += clsNewNumber;
		clsCount++;
		clsAverage = clsSum / clsCount;
	}
	
	// Method:  Mutator - a mutator method to add a number to the AverageCalculator 
	public void add(int fncvNewNum) {
		//clsNewNumber = fncvNewNum;
	}
	
	// Method:  Accessor - an accessor method to return the sum of all the numbers added to the AverageCalculator 
	public int getSum() {
		return clsSum;
	}
	
	// Method:  Accessor - an accessor method to return the count, or number, of numbers added to the AverageCalculator 
	public int getCount() {
		return clsCount;
	} 
	
	// Method:  Accessor - an accessor method to return the average of all the numbers added to the AverageCalculator 
	public double getAverage() {
		return clsAverage;
		} 
}
