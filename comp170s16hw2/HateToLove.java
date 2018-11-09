/**
 * HateToLove.java
 * 
 * Takes a string as input, and replaces the
 * first instance of the word "hate" with "love".
 * 
 * @author JESS CONWAY
 */
 
import java.util.*;

public class HateToLove
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a string containing the word \"hate\": ");
		String hateString = Keyboard.nextLine();
		
		String loveString = hateString.replace("hate", "love");
		
		System.out.println("Here, let me fix that for you: " + loveString);
		
	}	
	
}