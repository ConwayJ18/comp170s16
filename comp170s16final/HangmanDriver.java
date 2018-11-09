/**
 * HangmanDriver.java
 * 
 * Allows a user to play hangman.
 * 
 * @author JESS CONWAY, MICAELA MCGINLEY, JEREMY ARANGUREN, WALTER ALVARADO, ELIZABETH KIRINCICH
**/

import java.io.*;;
import java.util.*;

//Driver class & main method, written by Jess
public class HangmanDriver
{
 	public static void main(String args[])
 	{
 		Scanner Keyboard = new Scanner(System.in); //Creates scanner to read user guesses from keyboard
 		
 		//Opening sequence
 		boolean beginNewGame = true;
 		Hangman game1 = new Hangman();
 		System.out.println("Let's play Hangman!"); 
 		
		while(beginNewGame == true) //Checks if player wants to begin a new game, default is true
		{
			game1.newGame(); //Resets all variables, and assigns a new word
		
			//While loop makes sure game is still running
			while(game1.getWrongGuessesRemaining() > 0 && game1.getWordProgress().contains("*"))
			{	
				System.out.print("Enter a letter to guess: "); //Requests new letter
				String currentGuess = Keyboard.nextLine().toUpperCase(); //Assigns guess to currentGuess
				System.out.println(""); //For display purposes
				game1.checkGuess(currentGuess); //Checks guess
				
				game1.displayBoard(); //Displays board
				game1.displayPreviousGuesses(); //Displays previous guesses
			}
			//Exits when game is over
			
			if(game1.getWrongGuessesRemaining() != 0) //Checks if game was won or lost
			{
				System.out.println("You win!");
				game1.addWin(); //Adds a win to the scoreboard
				game1.getScore();
			}
			else
			{
				System.out.println("GAME OVER.");
				System.out.println("The word was: " + game1.getWord()); //Displays the completed word since not guessed
				game1.addLoss(); //Adds a loss to the scoreboard
				game1.getScore();
			}
		
			System.out.print("To begin a new game, type \"Y\": "); //Checks if user wants to start new game
			String newGame = Keyboard.nextLine().toUpperCase();
			if(newGame.equals("Y"))
			{
				beginNewGame = true;
			}
			else
			{
				beginNewGame = false;
			}	
	
		
		}
	}	
	
}