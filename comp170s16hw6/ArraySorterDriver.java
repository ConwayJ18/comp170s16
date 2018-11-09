/**
 * ArraySorterDriver.java
 * 
 * Description of Program
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class ArraySorterDriver
{
 	public static void main(String args[])
 	{
 		//Tests selectionSort()
 		int[] a = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
 		int[] b = new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
		
		ArraySorter.selectionSort(a);
		ArraySorter.selectionSort(b);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int j = 0; j < a.length; j++)
		{
			System.out.print(b[j] + " ");
		}
		System.out.println();
		
		//Tests bubbleSort()
		int[] c = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
 		int[] d = new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
		
		ArraySorter.bubbleSort(c);
		ArraySorter.bubbleSort(d);
		
		for(int u = 0; u < c.length; u++)
		{
			System.out.print(c[u] + " ");
		}		
		System.out.println();
		
		for(int v = 0; v < d.length; v++)
		{
			System.out.print(d[v] + " ");
		}
		System.out.println();

		//Four lines of 1 2 3 4 5 6 7 8 9 10 should be printed

	}	
	
}