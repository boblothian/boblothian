/**
 * Bubble sort for sorting time in order of speed
 * @author Robert Lothian
 * 08/02/21
 *
 */
public class Task_4 {

	/**
	 * This class is a bubble sort, takes array values and sorts them
	 * @param storedValues
	 */
	static void fastTimes(double[] storedValues)
	{
		int arrayLength = storedValues.length; //creates int arrayLength
		double temp =0; //tempory number set to 0
		for(int i=0; i<arrayLength; i++) //incremental for loop
		{
			for(int j=1; j<(arrayLength-i); j++) //loop if array minus i is greater than j, increment
			{
				if(storedValues[j-1]>storedValues[j])
				{
					temp= storedValues[j-1];			//algorithm for bubble loop
					storedValues[j-1] = storedValues[j];
					storedValues[j] = temp;
				}
			}
		}
	}
	/**
	 * Main method, calculates array length, fills array with random values and prints results
	 * @param args
	 */
	public static void main(String[] args) {
		
		int upperRange = 20, lowerRange = 10;	//range for number of speeds
		double upperSize = 500, lowerSize = 100;	//range of speed values
		int myArray = (int) (Math.random()*(upperRange-lowerRange)+lowerRange); //get random array length 
		double[] storedValues = new double[myArray];	
		
		for (int i=0; i<storedValues.length; i++)
		{	
			double number1=(double)(Math.random()*(upperSize-lowerSize)+lowerSize); //creates random files sizes between the lowest and highest
			storedValues[i]=(double)Math.abs(number1);
		}
		
		fastTimes(storedValues);
		
		System.out.println("The number of speeds recorded = "+storedValues.length); //print number of speeds recorded
		System.out.println("Times in order of speed");
		for(int i=0; i<storedValues.length; i++)	//loop for speed results 
		{
			System.out.printf("%.2f"+", ", storedValues[i]); //print results to 2 decimal places.
		}
		
	}

}
