/**
 * AverageofThree.java
 * 
 * Description of Program
 * 
 * @author JESS CONWAY
 */
 
import java.util.Scanner;

public class AverageOfThree
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a whole number: ");
		int n1 = Keyboard.nextInt();
		
		System.out.println("Please enter a whole number: ");
		int n2 = Keyboard.nextInt();
		
		System.out.println("Please enter a whole number: ");
		int n3 = Keyboard.nextInt();
		
		double average = (double)(n1 + n2 + n3) / 3;
		System.out.println("The arithmetic mean of those numbers is: " + average);
		
	}	
	
}