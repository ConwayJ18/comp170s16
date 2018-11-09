/**
 * WordCount.java
 * 
 * Takes a string as input, prints
 * the number of words in the string.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class WordCount
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		String userString = Keyboard.nextLine();
		
		String[] wordCount = userString.split("\\s+");
		
		System.out.println("The number of words in that string is: " + wordCount.length);
		
	}	
	
}