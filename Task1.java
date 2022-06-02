/**Robert Lothian
 * 27/01/21
 * RNG file size finder
 * 
 */
import java.util.Arrays;

public class Task1 {
	
/**
 * This is the main method not used as all variables, calculations and printing is
 * performed locally within the methods 
 * @param args
 */
	public static void main(String[] args)
	{
		displayNumbers();
	}
	
	/**
	 * This method is used to display the numbers generated in a table format
	 * 
	 */
	public static void displayNumbers()
	{
		int lowerNumber = 10,  upperNumber = 50, lowerSize = 100, upperSize = 400; //define variables for lowest and highest number and size 
		int numberOfFiles = (int)(Math.random()*(upperNumber-lowerNumber)+lowerNumber); //create random number between highest and lowest number
		System.out.print("========================LIST OF ALL SIZES GENERATED========================\n\n"); //header
		int[] sizeOfFiles = new int [numberOfFiles]; //create array to hold the sizes of files determined by the number previously generated
		for(int i=0; i<sizeOfFiles.length;i++) //Loops for length of array
		{
			int number1=(int)(Math.random()*(upperSize - lowerSize)+lowerSize); //creates random files sizes between the lowest and highest
			sizeOfFiles[i]=(int)(Math.abs(number1));
			
			if(i>0 && i%10==0) //print table with ten entries before moving to a new line
			{
				System.out.println();
			}
			System.out.print(+sizeOfFiles[i]+"\t");
		}	
		getLargest(sizeOfFiles, numberOfFiles); //call next method
	}
	
	/**
	 * This method is used to calculate the largest number generated
	 * @param sizeOfFiles
	 * @param numberOfFiles
	 */
	public static void getLargest(int[] sizeOfFiles, int numberOfFiles)
	{
		Arrays.sort(sizeOfFiles);
		int largestNumber = sizeOfFiles[numberOfFiles-1]; //refers the last entry in array 
		System.out.println("\n\n\n The largest file size is " +largestNumber+"MB");
		getSmallest(sizeOfFiles, numberOfFiles); //call next method
	}
	
	/**
	 * This method is used to display the smallest number generated
	 * @param sizeOfFiles
	 * @param numberOfFiles
	 */
	public static void getSmallest(int[] sizeOfFiles, int numberOfFiles)
	{
		int smallestNumber = sizeOfFiles[(numberOfFiles-numberOfFiles)];//refers to first entry in array (position 0) by subtracting by itself
		System.out.println("\n The smallest file size is " +smallestNumber+"MB");
		System.exit(0);//close the program
	}
	
}