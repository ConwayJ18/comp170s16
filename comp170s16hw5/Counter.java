import java.io.*;;
import java.util.*;

public class Counter
{
		private int count;
		
		public Counter()
		{
			count = 0;
		}
		
		public void resetCount()
		{
			count = 0;
		}
		
		public void increaseCount()
		{
			count++;
		}
		
		public void decreaseCount()
		{
			if(count >= 1)
			{
				count--;
			}
		}
		
		public int getCount()
		{
			return count;
		}
		
		public void displayCount()
		{
			System.out.println("The current count is: " + count);
		}
}