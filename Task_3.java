/**
 * Robert Lothian
 * 02/02/21
 * User name and password generator
 */
import java.util.Scanner;

public class Task_3 {
	/**
	 * Prompt user for first name and surname and recieve input via scanner class
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in); //create scanner

		System.out.println("Please enter your First Name:");
		String fName = sc.next(); //receive input
		System.out.println("Please enter your Surname:");
		String sName = sc.next();//receive input
		sc.close();//close the scanner as it's no longer needed
		
		getUserName(fName, sName);//call next method
	}
	/**
	 * Method to generate username
	 * @param fName
	 * @param sName
	 */
	public static void getUserName (String fName, String sName) {

		String userName = fName.charAt(0)+sName; //get first character from fistname and add it to surname

		userName = userName.toLowerCase(); //convert to lowercase
		System.out.println("\nYour user name is: "+userName);//print result

		getPassword(fName, sName);//call next method
	}
	/**
	 * Method to generate password
	 * @param fName
	 * @param sName
	 */
	public static void getPassword(String fName, String sName)
	{
		String password = sName.charAt(0)+fName; //get first character from surname and add it to first name

		password = password.toLowerCase(); //convert to lowercase
		System.out.println("\nYour user password is: "+password +"\n\n" //print result
				+ "=============================");

		System.exit(1); //exit program
	}

}
