/**
 * IncreasingThree.java
 * 
 * Takes 3 non-negative integers from user,
 * returns them in increasing order.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class IncreasingThree
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
		
		if(a <= b && a <= c)
		{
			if(b <= c)
			{
				System.out.println("Here are those integers in ascending order: " + a + ", " + b + ", " + c);
			}
			else
			{
				System.out.println("Here are those integers in ascending order: " + a + ", " + c + ", " + b);
			}	
		}
		else if (b <= a && b <=c)
		{
			if (a <= c)
			{
				System.out.println("Here are those integers in ascending order: " + b + ", " + a + ", " + c);
			}
			else
			{
				System.out.println("Here are those integers in ascending order: " + b + ", " + c + ", " + a);
			}
		}
		else if (c <= a && c <= b)
		{
			if (a <= b)
			{
				System.out.println("Here are those integers in ascending order: " + c + ", " + a + ", " + b);
			}
			else
			{
				System.out.println("Here are those integers in ascending order: " + c + ", " + b + ", " + a);
			}
		}
		
	}	
	
}