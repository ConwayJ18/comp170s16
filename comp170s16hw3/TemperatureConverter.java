/**
 * TemperatureConverter.java
 * 
 * Takes temperature with unit of measure
 * as input, returns new temperature converted
 * to other unit of measure.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class TemperatureConverter
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("I can convert temperatures between Celsius and Fahrenheit!");
		System.out.print("Please enter a temperature and it's unit (like this: 98 F): ");
		int userTemp = Keyboard.nextInt();
		String userUnit = Keyboard.next().toUpperCase();
		
		if(userUnit.equals("C"))
		{
			int convertedTemp = 9*(userTemp/5) + 32;
			System.out.println("Here is " + userTemp + " degrees Celsius converted to degrees Fahrenheit: " + convertedTemp + " F");
		}
		else
		{
			int convertedTemp = 5*(userTemp - 32) / 9;
			System.out.println("Here is " + userTemp + " degrees Fahrenheit converted to degrees Celsius: " + convertedTemp + " C");
		}
		
		
	}	
	
}