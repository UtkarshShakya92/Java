package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {12,45,23,56,34,67,33,89,33,23,23,89,67};
		
		int highest = Integer.MIN_VALUE;
		int secondhighest = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>highest)
			{
				secondhighest = highest;
				highest = a[i];
			}
			
			if(highest > a[i] && a[i] > secondhighest )
			{
				secondhighest = a[i];
			}
		}
		
		System.out.println(secondhighest);
	}
		
		

}
