/**
 * FahrenheitToCelsius.java
 * 
 * Takes a temperature in degrees Fahrenheit
 * as input, then prints the temperature
 * converted to degrees Celsius.
 * 
 * @author JESS CONWAY
 */

import java.util.*;

public class FahrenheitToCelsius
{
 	public static void main(String args[])
 	{
 	
 		Scanner Keyboard = new Scanner(System.in);
 		
		System.out.print("Enter a Fahrenheit temperature as a whole number: ");
		int degreesFahrenheit = Keyboard.nextInt();
		
		double degreesCelsius = 5*((double)degreesFahrenheit - 32) / 9;
		
		System.out.println(degreesFahrenheit + " degrees Fahrenheit is " + degreesCelsius + " degrees Celsius.");
		
	}	
	
}