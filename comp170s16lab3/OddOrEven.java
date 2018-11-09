/**
 * OddOrEven.java
 * 
 * Takes an int from the user, prints if it's odd or even.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class OddOrEven
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("I can tell if integers are odd or even!");
		
		System.out.print("Please enter an integer: ");
		int userInt = Keyboard.nextInt();
		
		if(userInt%2 == 0)
		{
			System.out.println("That number is even!");
		}
		else
		{
			System.out.println("That number is odd!");
		}
		
	}	
	
}