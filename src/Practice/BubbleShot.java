package Practice;

import java.util.Arrays;
import java.util.List;

public class BubbleShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		bubbleShotusingfor();
		
		bubbleShotStream();
	}
	
	public static  int [] bubbleShotusingfor()
	{
       int a []= {10,40,20,15,50,30};
		
		int n = a.length-1;
		
		System.out.println("Array before sorting "+Arrays.toString(a));
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] =temp;
				}
			}
		} 
		
		System.out.println("Array After sorting "+Arrays.toString(a));
		return a;
	
	}
	
	public static List<Integer> bubbleShotStream()
	{
		List<Integer> numbers = Arrays.asList(67,50,-2,-22,44,20,10,40,70,43);
		numbers.stream().distinct().sorted().forEach(n -> System.out.println(n));
		return numbers ;
	}
}
