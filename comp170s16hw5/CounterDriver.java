/**
 * CounterDriver.java
 * 
 * Description of Program
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class CounterDriver
{
 	public static void main(String args[])
 	{
 		Counter count1 = new Counter();
 		
 		count1.increaseCount(); //Count is 1
 		count1.increaseCount();	//Count is 2
 		count1.increaseCount(); //Count is 3
 		count1.displayCount();	//Prints count = 3
 		
 		count1.decreaseCount(); //Count is 2
 		System.out.println(count1.getCount());	//Prints count = 2
 		
 		count1.resetCount(); //Count is 0
 		count1.displayCount(); //Prints count = 0
 		count1.decreaseCount();	//Count remains 0
 		count1.displayCount();	//Prints count = 0
		
	}	
	
}