/**
 * TriangleWriter.java
 * 
 * Takes an integer from user (1-50), prints
 * a triangle with a height of that number.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class TriangleWriter
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter an integer height for the triangle: ");
		int height = Keyboard.nextInt();
		
		String asterisks = "";
		
		for(int i = 1; i <= height; i++)
		{	
			asterisks = asterisks + "*";
			System.out.println(asterisks);
		}
		
		for(int k = height-1; k >= 1; k--)
		{
			asterisks = asterisks.substring(0, k);
			System.out.println(asterisks);
		}
		
	}	
	
}