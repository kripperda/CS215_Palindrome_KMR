import java.util.Scanner; //import Scanner for inputs
import java.util.Stack; //Stack import for use

public class Palindrome {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: ");//scanner input to check
		String inputString = sc.nextLine();//input string to test
		Stack stack = new Stack(); //creating the stack to push and pop
		
		/*for loop to allow the string to be run up and down upon to test
		 */
		for (int i=0; i<inputString.length(); i++) {
			stack.push(inputString.charAt(i));
		}
		
		/* function to reverse the string to reverse the characters
		 */
		String reverseString = "";
		
		/*while loop to close the stack loop when it runs out of characters to test
		 */
		while (!stack.isEmpty()) {
			reverseString = reverseString+stack.pop();
		}
		
		/*if statement to provide output on palindrome status
		 */
		if (inputString.equals(reverseString))
			System.out.println("String IS a palindrome.");
		else
			System.out.println("String IS NOT a palindrome.");
	}//end main

}//end class
