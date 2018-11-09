import java.io.*;
import java.util.*;

public class Hangman
{
	//Jess
	//Declares all variables as private, no static variables means no need for third class
	private int wrongGuessesRemaining;
	private String word;
	private String wordCopy;
	private String wordProgress;
	private String[] previousGuesses;
	private int spotMarker;
	private int gamesWon;
	private int gamesLost;
	private String score;
	
	//Jess
	public Hangman() //Default constructor, only constructor necessary
	{
		word = "";
		wrongGuessesRemaining = 0;
		wordCopy = "";
		wordProgress = "";
		previousGuesses = new String[26]; //Length 26 because 26 letters in alphabet
		gamesWon = 0;
		gamesLost = 0;
		score = "";
	}
	
	//Jeremy
	public void newGame() //Creates a new game, initializes variables, acts similar to constructor, only true mutator method
	{
		word = this.newWord(); //Grabs word for game
		wrongGuessesRemaining = 6; //6 parts to a hangman drawing
		wordCopy = word; //Creates copy of word to remain unchanged
		wordProgress = ""; //Empty, filled in later
		spotMarker = 0; //Necessary for previousGuesses array filling
		
		for(int n = 0; n < previousGuesses.length; n++)
		{
			previousGuesses[n] = ""; //Voids out the previousGuesses array
		}
		
		for(int i = 0; i < word.length(); i++)
		{
			wordProgress = wordProgress + "*"; //Every * represents a letter in the game word
		}
		
		this.displayBoard(); //Displays opening board
	}
	
	//Jeremy
	public String newWord() //Grabs new word from wordList.txt to be used as game word
	{
		try
		{
			FileInputStream fs= new FileInputStream("wordList.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fs));
			int q = (int)(Math.random() * 354925); //Picks random word based on line number
        	 
        	for(int i = 0; i < q; i++) //Skips all lines up to the word line
        	{
				br.readLine();
			}
			word = br.readLine().toUpperCase(); //Grabs the word from the random line
       
	    }
	    catch(Exception e)
	    {
        	e.printStackTrace();
        }
        
		return word;
	}
	
	//Jess
	public String getWord() //Returns the word
	{
		return wordCopy;
	}
	
	//Jess
	public int getWrongGuessesRemaining() //Returns the wrong guesses
	{
		return wrongGuessesRemaining;
	}
	
	//Jess
	public String getWordProgress() //Returns the word progress
	{
		return wordProgress;
	}
	
	//Danielle
	public void checkGuess(String guess) //Checks validity, uniqueness, and accuracy of guess
	{
		if(this.checkValidity(guess))
		{
			if(this.checkUniqueness(guess))
			{
				this.checkAccuracy(guess);
			}
		}
	}
	
	//Danielle
	public boolean checkValidity(String guess) //Checks that guess is a letter
	{
		if(guess.equals("A") || guess.equals("B") || guess.equals("C") || guess.equals("D") || guess.equals("E") || guess.equals("F") || guess.equals("G") || guess.equals("H") || guess.equals("I") || guess.equals("J") || guess.equals("K") || guess.equals("L") || guess.equals("M") || guess.equals("N") || guess.equals("O") || guess.equals("P") || guess.equals("Q") || guess.equals("R") || guess.equals("S") || guess.equals("T") || guess.equals("U") || guess.equals("V") || guess.equals("W") || guess.equals("X") || guess.equals("Y") || guess.equals("Z"))
		{
			return true;
		}
		else
		{
			System.out.println("Invalid guess.");
			return false;
		}
	}
	
	//Danielle
	public boolean checkUniqueness(String guess) //Checks that guess hasn't already been guessed this game
	{
		if(Arrays.asList(previousGuesses).contains(guess))
		{
			System.out.println("You've already guessed that letter!");
			return false;
		}
		else
		{
			return true;
		}
	}
		
	//Danielle
	public void checkAccuracy(String guess) //Checks if guessed letter is in the word
	{
		if(word.contains(guess))
		{
			while(word.contains(guess)) //Scans word for guess
			{
				wordProgress = wordProgress.substring(0, word.indexOf(guess)) + guess + wordProgress.substring(word.indexOf(guess)+1); //Replaces "*" in wordProgress with letter
				word = word.substring(0,word.indexOf(guess)) + "_" + word.substring(word.indexOf(guess)+1); //Replaces letter in word with "_"
			}
		}
		else
		{
			wrongGuessesRemaining--; //If guess is wrong, deducts from guessesRemaining
		}
		
		previousGuesses[spotMarker] = guess; //Adds guess to list of already guessed letters
		spotMarker++;
	}

	//Michaela
	public void displayBoard() //Displays the gallows and the progress of the word
	{
		if(wrongGuessesRemaining == 6)
		{
			System.out.println("  ____");
			System.out.println(" |    |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("______|__");
			System.out.println("6 wrong guesses remaining.");
			System.out.println(this.getWordProgress());

		}
		else if(wrongGuessesRemaining == 5)
		{
			System.out.println("  ____");
			System.out.println(" |    |");
			System.out.println(" O    |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("______|__");
			System.out.println("5 wrong guesses remaining.");
			System.out.println(this.getWordProgress());
		}
		else if(wrongGuessesRemaining == 4)
		{
			System.out.println("  ____");
			System.out.println(" |    |");
			System.out.println(" O    |");
			System.out.println(" |    |");
			System.out.println(" |    |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("______|__");
			System.out.println("4 wrong guesses remaining.");
			System.out.println(this.getWordProgress());
		}
		else if(wrongGuessesRemaining == 3)
		{
			System.out.println("  ____");
			System.out.println(" |    |");
			System.out.println(" O    |");
			System.out.println("/|    |");
			System.out.println(" |    |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("______|__");
			System.out.println("3 wrong guesses remaining.");
			System.out.println(this.getWordProgress());
		}
		else if(wrongGuessesRemaining == 2)
		{
			System.out.println("  ____");
			System.out.println(" |    |");
			System.out.println(" O    |");
			System.out.println("/|\\   |");
			System.out.println(" |    |");
			System.out.println("      |");
			System.out.println("      |");
			System.out.println("______|__");
			System.out.println("2 wrong guesses remaining.");
			System.out.println(this.getWordProgress());
		}
		else if(wrongGuessesRemaining == 1)
		{
			System.out.println("  ____");
			System.out.println(" |    |");
			System.out.println(" O    |");
			System.out.println("/|\\   |");
			System.out.println(" |    |");
			System.out.println("/     |");
			System.out.println("      |");
			System.out.println("______|__");
			System.out.println("1 wrong guess remaining.");
			System.out.println(this.getWordProgress());
		}
		else if(wrongGuessesRemaining == 0)
		{
			System.out.println("  ____");
			System.out.println(" |    |");
			System.out.println(" O    |");
			System.out.println("/|\\   |");
			System.out.println(" |    |");
			System.out.println("/ \\   |");
			System.out.println("      |");
			System.out.println("______|__");
			System.out.println(this.getWordProgress());
		}
	}
	
	//Michaela
	public void displayPreviousGuesses() //Displays the user's previous guesses
	{
		System.out.print("Previous Guesses: ");
		for(int w = 0; w < previousGuesses.length; w++)
		{
			System.out.print(previousGuesses[w] + " ");
		}
		
		System.out.println();
	}
	
	//Walter
	public void addWin() //Adds a win to the user scoreboard
	{
		gamesWon++;
	}
	
	//Walter
	public void addLoss() //Adds a loss to the user scoreboard
	{
		gamesLost++;
	}
	
	//Walter
	public void getScore() //Displays the user scoreboard
	{
		System.out.println("You've won " + gamesWon + " games, and lost " + gamesLost + " games.");
	}
	
}