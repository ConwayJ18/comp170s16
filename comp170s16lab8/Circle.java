import java.io.*;
import java.util.*;

public class Circle
{
	/*
		Declare variables & constructors
	*/
 	
 	String color;
 	double radius;
 	
 	public Circle() //Default Constructor
 	{
 	
 	}
 	
 	public Circle(double r, String c) //Full Constructor
 	{
 		color = c;
 		radius = r;
 	}
 	
 	public void setColor(String c)
	{
		color = c;
	}
		
	public void setRadius(double r)
	{
		radius = r;
	}
	
	/*
	 	Begin methods (organized alphabetically)
	*/
	
	public double computeArea()
	{
		double area = Math.PI * radius * radius;
		
		return area;
	}
	
	public double computeCircumference()
	{
		double circumference = 2 * Math.PI * radius;
		
		return circumference;
	}
	
	public void display()
	{
		System.out.println("I am a circle");
		System.out.println("My color is " + color);
		System.out.println("My radius is " + radius);
	}
	
	public void doubleRadius()
	{
		radius = radius * 2;
	}
	
	public boolean equals(Circle otherCircle)
	{
		if(this.getRadius() == otherCircle.getRadius() && this.getColor().equals(otherCircle.getColor()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public String getColor()
	{
		return color;
	}
}