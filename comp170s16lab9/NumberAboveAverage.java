/**
 * NumberAboveAverage.java
 * 
 * Takes 10 temperatures from user, averages
 * them, and then returns days with temperatures
 * above the average, and total number of days
 * above average.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class NumberAboveAverage
{
 	public static void main(String args[])
 	{
 		Scanner Keyboard = new Scanner(System.in);
 		
		double[] temperatureList = new double[10];
		double tempSum = 0;
		double meanTemp = 0;
		int totalAboveAverage = 0;
		
		System.out.println("Please enter ten temperature values:");
		
		for(int i = 0; i < 10; i++)
		{
			temperatureList[i] = Keyboard.nextDouble(); //Adds 10 numbers to array
			tempSum = tempSum + temperatureList[i];
		}

		meanTemp = tempSum / 10;
		System.out.println("The average temperature is: " + meanTemp);
		
		for(int k = 0; k < 10; k++)
		{
			if(temperatureList[k] > meanTemp)
			{
				System.out.println("Day " + k + " had temperature " + temperatureList[k] + " which was above average");
				totalAboveAverage++;
			}
		}
		
		System.out.println("The number of days with a temperature above average is: " + totalAboveAverage);

	}	
	
}