/**
 * FactorialCalculator.java
 * 
 * Takes an integer as input from user
 * returns it's factorial.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class FactorialCalculator
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("I can calculate factorials!");
		
		System.out.print("Please enter a positive integer: ");
		int userInt = Keyboard.nextInt();
		long factorial = 1;
		
		for(int i = userInt; i>=1; i--)
		{
			factorial = factorial * i;
		}
		
		System.out.println(userInt + "! = " + factorial);
		
	}	
	
}