/**
 * BMRcalculator.java
 * 
 * Takes a user's height, weight, and age, calculates
 * the BMR of a man and woman who meet the given parameters,
 * and returns the number of 230 calorie chocolate bars each
 * would need to eat to maintain their current weight.
 *
 * @author JESS CONWAY
 */

import java.util.*;

public class BMRcalculator
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("We are going to calculate your Basal Metabolic Rate!");

		System.out.print("Please enter your current weight (in pounds): ");
		double userWeight = Keyboard.nextDouble();
		
		System.out.print("Please enter your current height (in inches): ");
		double userHeight = Keyboard.nextDouble();
		
		System.out.print("Please enter your current age (in years): ");
		double userAge = Keyboard.nextDouble();
		
		double femaleCalories = 655 + (4.3 * userWeight) + (4.7 * userHeight) - (4.7 * userAge);
		double maleCalories = 66 + (6.3 * userWeight) + (12.9 * userHeight) - (6.8 * userAge);
		double femaleChocolate = femaleCalories / 230;
		double maleChocolate = maleCalories / 230;
		
		System.out.println("If you are a female, your BMR is " + Math.round(femaleCalories) + " calories, meaning you'd have to eat " + Math.round(femaleChocolate) + " 230-calorie chocolate bars per day to maintain your weight without exercise.");
		System.out.println("If you are a male, your BMR is " + Math.round(maleCalories) + " calories, meaning you'd have to eat " + Math.round(maleChocolate) + " 230-calorie chocolate bars per day to maintain your weight without exercise.");
		
	}	
	
}