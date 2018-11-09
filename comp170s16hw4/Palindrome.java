/**
 * Palindrome.java
 * 
 * Takes String as input, returns the
 * String reversed. Then prints if the original
 * String was a palindrome.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class Palindrome
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		String userString = Keyboard.nextLine();
		
		String reversalString = "";
		
		for(int i = userString.length() - 1; i >= 0; i--)
		{
			String character = userString.substring(i, i+1);
			reversalString = reversalString + character;
		}
		
		System.out.println("The reverse of that string is: " + reversalString);
		
		if(userString.equals(reversalString))
		{
			System.out.println("That means the original string was a palindrome!");
		}
		else
		{
			System.out.println("The original string was not a palindrome.");
		}
				
	}	
	
}