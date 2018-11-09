/**
 * FourDigitsFourLines.java
 * 
 * Takes a 4 digit integer from the user (as a String),
 * and prints each digit on its own line.
 * 
 * @author JESS CONWAY
 */

import java.util.*;

public class FourDigitsFourLines
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a 4 digit integer: ");
		String fourDigit = Keyboard.nextLine();
		
		System.out.println("\nHere is that number, with each digit on its own line: ");
		
		for(int i = 0; i < fourDigit.length(); i++)
		{
			System.out.println(fourDigit.charAt(i));
		}		
		
	}	
	
}