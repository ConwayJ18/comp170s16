/**
 * GradeDistribution.java
 * 
 * Takes in a list of grades as integer percentages,
 * prints total number of grades, and number of each
 * letter grade.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class GradeDistribution
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		int total = 0;
		
		System.out.print("Enter an integer grade to be added to the distribution: ");
		int grade = Keyboard.nextInt();
		
		while(grade >= 0)
		{
			total++;
			
			if(grade >= 90)
			{
				a++;
			}
			else if(grade >= 80)
			{
				b++;
			}
			else if(grade >= 70)
			{
				c++;
			}
			else if(grade >= 60)
			{
				d++;
			}
			else
			{
				f++;
			}
			
			System.out.println("Enter an integer grade to be added to the distribution");
			System.out.print("(if your list is complete, enter a negative integer): ");
			grade = Keyboard.nextInt();
			
		}
			
		System.out.println("Here is the grade distrubtion...");
		System.out.println("Total number of grades = " + total);
		System.out.println("Number of A's = " + a);
		System.out.println("Number of B's = " + b);
		System.out.println("Number of C's = " + c);
		System.out.println("Number of D's = " + d);
		System.out.println("Number of F's = " + f);
		
	}	
	
}