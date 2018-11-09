/**
 * SumOfUnknown.java
 * 
 * Takes a list of positive integers, one at a time from user.
 * Ends accumulation of list when user inputs a negative number.
 * Adds and returns sum of positive integers.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class SumOfUnknown
{
 	public static void main(String args[])
 	{
 		System.out.println("I can add the integers in a list you give me!");
 		Scanner Keyboard = new Scanner(System.in);
 		
		int next = 0;
		int sum = 0;
		
		while(next >= 0)
		{
			System.out.println("Enter a positive integer for me to add to the list");
			System.out.print("(if your list is complete, enter a negative number): ");
			next = Keyboard.nextInt();
			
			if(next >= 0)
			{
				sum = sum + next;
			}
		}
		
		System.out.println("The sum of those numbers is: " + sum);
				
	}	
	
}