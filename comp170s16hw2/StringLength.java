/**
 * StringLength.java
 * 
 * Takes 2 strings from keyboard, prints them on separate lines
 * with their lengths, and then combines them, separated by a 
 * space, and prints the new string on a new line with it's length.
 * 
 * @author JESS CONWAY
 */

import java.util.Scanner;

public class StringLength
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		String string1 = Keyboard.nextLine();
		int length1 = string1.length();
		
		System.out.print("Please enter another string: ");
		String string2 = Keyboard.nextLine();
		int length2 = string2.length();
		
		System.out.println("\nHere are your strings and their lengths: ");
		System.out.println(string1 + " = " + length1 + " characters.");
		System.out.println(string2 + " = " + length2 + " characters.");
		
		System.out.println("\nHere are your strings combined, separated by a space, and their combined length: ");
		System.out.println(string1 + " " + string2 + " = " + (length1 + length2 + 1));
		
	}	
	
}