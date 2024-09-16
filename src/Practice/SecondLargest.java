package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] a= {10,30,50,20,40,80,70,30,70,80};
		
		/*int largest = 0;//Integer.MIN_VALUE;
		int secondLargest =0;// Integer.MIN_VALUE;
		
		for(int i =0;i<a.length;i++)
		{ 
			if(a[i]>largest)
			{
				secondLargest = largest;
				largest = a[i]; 
				}
			
			else if (a[i] > secondLargest && a[i] < largest)
			{
				secondLargest = a[i];
			}
		}
		
		System.out.println("The Second Largest value is "+ secondLargest );*/
		
		List<Integer> number =Arrays.asList(10,30,50,20,40,80,70,30,70,80);
		Integer numbers = number.stream().distinct().sorted(Comparator.reverseOrder()).skip(1)
				          .findFirst().get();
		
		System.out.println(numbers);
	}
		
		

}
