/**
 * 
 */
package assignment7_1;
import java.util.Scanner;

/**
 * Class to convert an int variable to String using an inbuilt function of String class.
 * 
 * @author Sandeep
 *
 */
public class Assignment7_1 { 						// Class starts

	/**
	 * @param args
	 */
	public static void main(String[] args) { 		// main method
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 	// Creating Scanner object to take input
		
		String str = new String();					// Creating String object
		
		System.out.println("Enter the integer you want to convert :");
		int number = scanner.nextInt();				// Assigning integer to local variable
		
		str = String.valueOf(number);				// Coverting to String using valueOf(int)
		
		System.out.println("String form is "+str);					// Printing the string
		
		scanner.close(); 							// Closing scanner object
		
	}

}
