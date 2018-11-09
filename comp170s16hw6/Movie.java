public class Movie
{
	private String name;
	private String mpaa;
	private int[] ratings = new int[20];
	private double average;
	private int spotMarker;
	
	public Movie()
	{
		name = "";
		mpaa = "";
		
		for(int k = 0; k < ratings.length; k++)
		{
			ratings[k] = 0;
		}
		
		spotMarker = 0;
		average = 0;
	}
	
	public Movie(String movieName, String movieMPAA)
	{
		name = movieName;
		mpaa = movieMPAA;

		for(int j = 0; j < ratings.length; j++)
		{
			ratings[j] = 0;
		}
		
		spotMarker = 0;
		average = 0;
	}
	
	public void setName(String movieName)
	{
		name = movieName;
	}
	
	public void setMPAA(String movieMPAA)
	{
		mpaa = movieMPAA;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMPAA()
	{
		return mpaa;
	}
	
	public void addRating(int rating)
	{
		if(rating >= 1 && rating <=5)
		{
			ratings[spotMarker] = rating;
			
			spotMarker++;
		}
	}
	
	public double getAverage()
	{
		for(int i = 0; i < ratings.length; i++)
		{
			average = average + ratings[i];
		}
		average = average / (spotMarker+1);
		
		return average;
	}
	
	
}