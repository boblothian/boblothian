/**Robert Lothian
 * 29/01/21
 * Additional functionality to the RNG file program
 * 
 */
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {

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
		int[] arrayOfFiles = new int [numberOfFiles]; //create array to hold the sizes of files determined by the number previously generated
		for(int i=0; i<arrayOfFiles.length;i++) //Loops for length of array
		{
			int number1=(int)(Math.random()*(upperSize-lowerSize)+lowerSize); //creates random files sizes between the lowest and highest
			arrayOfFiles[i]=(int)(Math.round(number1));

			if(i>0 && i%10==0) //print table with ten entries before moving to a new line
			{
				System.out.println();
			}
			System.out.print(+arrayOfFiles[i]+"\t");
		}	
		getLargest(arrayOfFiles, numberOfFiles); //call next method
	}

	/**
	 * This method is used to calculate the largest number generated
	 * @param arrayOfFiles
	 * @param numberOfFiles
	 */
	public static void getLargest(int[] arrayOfFiles, int numberOfFiles)
	{
		Arrays.sort(arrayOfFiles);
		int largestNumber = arrayOfFiles[numberOfFiles-1]; //refers the last entry in array 
		System.out.println("\n\n\nThe largest file size is " +largestNumber+"MB");
		getSmallest(arrayOfFiles, numberOfFiles); //call next method
	}

	/**
	 * This method is used to display the smallest number generated
	 * @param arrayOfFiles
	 * @param numberOfFiles
	 * @return 
	 */
	public static void getSmallest(int[] arrayOfFiles, int numberOfFiles)
	{
		int smallestNumber = arrayOfFiles[(numberOfFiles-numberOfFiles)];//refers to first entry in array (position 0) by subtracting by itself
		System.out.println("\nThe smallest file size is " +smallestNumber+"MB");

		totalFileSizes(arrayOfFiles, numberOfFiles);
	}
	/**
	 * This method get's the total file size by adding all the values in the array using IntStream.of
	 * @param arrayOfFiles
	 * @param numberOfFiles
	 */
	public static void totalFileSizes(int[]arrayOfFiles, int numberOfFiles)
	{
		int totalFileSize = IntStream.of(arrayOfFiles).sum();//to calculate the total size of int values held in Array
		System.out.println("\nThe total size of files is " +totalFileSize+"MB");//prints result
		averageSize(numberOfFiles, totalFileSize, arrayOfFiles);
	}
	/**
	 * This method finds the average file size by taking the totalFileSize 
	 * and dividing it by numberOfFiles
	 * @param numberOfFiles
	 * @param totalFileSize
	 * @param arrayOfFiles
	 */
	public static void averageSize(int numberOfFiles, int totalFileSize, int[] arrayOfFiles)
	{
		int avgSize = totalFileSize/numberOfFiles;//to calculate avg file size
		System.out.println("\nThe average file size is "+avgSize+"MB");//prints result

		displayLargestToSmallest(arrayOfFiles);
	}
	/**
	 * this method display's file sizes in descending order by defining i as the length of the Array - 1 
	 * and then decreasing the value by i if i is greater than 0
	 * @param arrayOfFiles
	 */
	public static void displayLargestToSmallest(int[]arrayOfFiles)
	{
		System.out.println("\n===============SIZES ARRANGED FROM LARGE TO SMALL==========================\n");
		for(int i=arrayOfFiles.length-1;i>=0;i--) //creates descending order loop
		{
			if(i%10==0)//to display table
			{
				System.out.println();
			}
			System.out.print(arrayOfFiles[i]+"\t");//to print results
		}
	}
}

