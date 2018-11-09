/**
 * HighLowMean.java
 * 
 * Takes list of non-negative integers, prints
 * highest integer, lowest integer, and average of
 * all integers.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class HighLowMean
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter an integer to be added to the list: ");
		int userInt = Keyboard.nextInt();
		int low = userInt;
		int high = userInt;
		double sum = 0;
		int length = 0;
		
		while(userInt >= 0)
		{
			length++;
			sum = sum + userInt;
			
			if(userInt < low)
			{
				low = userInt;
			}
			
			if(userInt > high)
			{
				high = userInt;
			}
		
			System.out.println("Please enter an integer to be added to the list");
			System.out.print("(if your list is complete, enter a negative integer: ");
			userInt = Keyboard.nextInt();
		}
			
		double mean = sum / length;
			
		System.out.println("The highest of those numbers is: " + high);
		System.out.println("The lowest of those numbers is: " + low);
		System.out.println("The mean of those numbers is: " + mean);

		
	}	
	
}