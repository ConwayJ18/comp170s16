/**
 * SmallestOfThree.java
 * 
 * Takes 3 non-negative integers from user,
 * returns the lowest of them.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class SmallestOfThree
{
 	public static void main(String args[])
 	{
 		Scanner Keyboard = new Scanner(System.in);
 		
		System.out.print("Please enter a non-negative integer: ");
		int a = Keyboard.nextInt();
		
		System.out.print("Please enter another non-negative integer: ");
		int b = Keyboard.nextInt();
		
		System.out.print("Please enter a third non-negative integer: ");
		int c = Keyboard.nextInt();
		
		if(a < b)
		{
			if(a < c)
			{
				System.out.println("The lowest of those numbers is: " + a);
			}
			else
			{
				System.out.println("The lowest of those numbers is: " + c);
			}
		}
		else
		{
			if(b < c)
			{
				System.out.println("The lowest of those numbers is: " + b);
			}
			else
			{
				System.out.println("The lowest of those numbers is: " + c);
			}
		}
		
		
		
		
		
		
		
	}	
	
}