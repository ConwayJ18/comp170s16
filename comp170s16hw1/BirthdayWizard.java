/**
 * BirthdayWizard.java
 * 
 * Takes user's birth-year as input, asks for integer n
 * and prints the year the user's nth birthday will occur
 * 
 * @author JESS CONWAY
 */

import java.util.Scanner;

public class BirthdayWizard
{
 	public static void main(String args[])
 	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your birth-year.");
		int birthYear = keyboard.nextInt();
		
		System.out.println("Please enter your age at a future birthday.");
		int futureAge = keyboard.nextInt();
		
		int futureYear = birthYear + futureAge;
		System.out.println("You will reach this age in the year " + futureYear + ".");
		
	}	
	
}