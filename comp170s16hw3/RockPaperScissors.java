/**
 * RockPaperScissors.java
 * 
 * Takes R, P, or S from user(s), returns winner
 * using rules of Rock, Paper, Scissors.
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class RockPaperScissors
{
 	public static void main(String args[])
 	{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Let's play Rock, Paper, Scissors!");
		
		System.out.print("Player 1 - Type R, P, or S: ");
		String player1 = Keyboard.nextLine().toUpperCase();
		
		System.out.print("Player 2 - Type R, P, or S: ");
		String player2 = Keyboard.nextLine().toUpperCase();		
		
		if(player1.equals("R"))
		{
			if(player2.equals("R"))
			{
				System.out.println("It's a tie!");
			}
			else if(player2.equals("P"))
			{
				System.out.println("Paper covers Rock! Player 2 wins!");
			}
			else
			{
				System.out.println("Rock smashes Scissors! Player 1 wins!");
			}
		}
		else if(player1.equals("P"))
		{
			if(player2.equals("R"))
			{
				System.out.println("Paper covers Rock! Player 1 wins!");
			}
			else if(player2.equals("P"))
			{
				System.out.println("It's a tie!");
			}
			else
			{
				System.out.println("Scissors cut Paper! Player 2 wins!");
			}
		}
		else
		{
			if(player2.equals("R"))
			{
				System.out.println("Rock smashes Scissors! Player 2 wins!");
			}
			else if(player2.equals("P"))
			{
				System.out.println("Scissors cut Paper! Player 1 wins!");
			}
			else
			{
				System.out.println("It's a tie!");
			}
		}
		
	
		
	}	
	
}