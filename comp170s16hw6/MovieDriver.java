/**
 * MovieDriver.java
 * 
 * Description of Program
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class MovieDriver
{
 	public static void main(String args[])
 	{
 		Movie movie1 = new Movie();
 		movie1.setName("500 Days of Summer");
 		movie1.setMPAA("PG-13");
 		movie1.addRating(1);
 		movie1.addRating(2);
 		movie1.addRating(3);
 		movie1.addRating(4);
 		movie1.addRating(5);
 		movie1.addRating(5);
 		movie1.addRating(5);
 		movie1.addRating(4);
		movie1.addRating(3);
		movie1.addRating(4);
		System.out.println("Movie name: " + movie1.getName());
		System.out.println("Movie MPAA: " + movie1.getMPAA());
		System.out.println("Average rating: " + movie1.getAverage());
		
		Movie movie2 = new Movie("Snatch.", "R");
		movie2.addRating(5);
 		movie2.addRating(4);
 		movie2.addRating(3);
 		movie2.addRating(3);
 		movie2.addRating(2);
 		movie2.addRating(5);
 		movie2.addRating(4);
 		movie2.addRating(4);
		movie2.addRating(3);
		movie2.addRating(4);
		System.out.println("Movie name: " + movie2.getName());
		System.out.println("Movie MPAA: " + movie2.getMPAA());
		System.out.println("Average rating: " + movie2.getAverage());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	
}