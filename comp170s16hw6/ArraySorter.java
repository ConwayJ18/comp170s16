import java.io.*;;
import java.util.*;

public class ArraySorter
{	
	/**
	Precondition: Every element in anArray has a value.
	Action: Sorts the array into ascending order
	*/	
	public static void selectionSort(int[] anArray)
	{
		for(int index = 0; index < anArray.length - 1; index++)
		{	//Place the correct value in anArray[index]
			int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfNextSmallest, anArray);
			//Assertion: anArray[0] <= anArray[1] <= ... <= anArray[index]
			//and these are the smallest of the original array elements.
			//The remaining positions contain the rest of the original
			//array elements.
		}
	}	
		
	/**
	Precondition: Every element in anArray has a value.
	Action: Sorts the array into ascending order
	*/	
	public static void bubbleSort(int[] a)
	{	
		boolean stillSorting = true;
		
		while(stillSorting)
		{
			stillSorting = false;
			
			for(int index = 0; index < a.length - 1; index++)
			{
				if(a[index] > a[index+1])
				{
					interchange(index, index+1, a);
					stillSorting = true;
				}
			}
		} 
	}
		
	/**
	Returns the index of the smallest value in the portion of the array
	that begins at the element whose last index is startIndex and
	ends at the last element.
	*/
	private static int getIndexOfSmallest(int startIndex, int[] a)
	{
		int min = a[startIndex];
		int indexOfMin = startIndex;
		for(int index = startIndex + 1; index < a.length; index++)
		{
			if(a[index] < min)
			{
				min = a[index];
				indexOfMin = index;
				//min is smallest of a[startIndex] through a[index]
			}
		}
		return indexOfMin;
	}
	
	/**
	Precondition: i and j values are valid indices for the array a.
	Postcondition: Values of a[i] and a[j] have been interchanged
	*/
	private static void interchange(int i, int j, int[] a)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; //Original value of a[i]
	}	
	
}