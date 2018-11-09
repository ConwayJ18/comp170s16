import java.io.*;
import java.util.*;

public class Circle
{
 	String color;
 	double radius;
 	
 	public Circle()
 	{
 	
 	}
 	
 	public Circle(String c, double r)
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
	
	public void display()
	{
		System.out.println("I am a circle");
		System.out.println("My color is " + color);
		System.out.println("My radius is " + radius);
	}
	
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
	
}