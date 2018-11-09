/**
 * TimeDriver.java
 * 
 * Description of Program
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class TimeDriver
{
 	public static void main(String args[])
 	{
 		Time time1 = new Time();
 		time1.setTime(0, 15);
 		
 		Time time2 = new Time(1, 30);
 		time2.setTime(1, 30, true);
 		
 		Time time3 = new Time(12, 45);
 		
 		Time time4 = new Time(2, 00, false);
 		
 		System.out.println(time1.getTime24());
 		System.out.println(time1.getTime12());
 		
 		System.out.println(time2.getTime24());
 		System.out.println(time2.getTime12());
 		
 		System.out.println(time3.getTime24());
 		System.out.println(time3.getTime12());
 		
 		System.out.println(time4.getTime24());
 		System.out.println(time4.getTime12());	
		
		
		
		
		
		
		
		
		
		
		
	}	
	
}