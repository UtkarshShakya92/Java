package infoPractice;

import java.util.Arrays;

public class ArrayNumberStartwith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] a = {23,12,345,123,111,345,123,16,38};
		
		for(int arr : a)
		{
			String s = Integer.toString(arr);
			
			if(s.charAt(0)=='1')
			{
				System.out.println(arr);
			}
					
		}*/
		
		int [] a = {1,11,23,34,123,45,145,167};
		
		/*for(int i=0;i<a.length;i++)
		{
			String s = Integer.toString(a[i]);
			
			if(s.charAt(0)=='1')
			{
				System.out.println(a[i]);
			}
		}
		*/
		
		for(int arr: a)
		{
			String s = Integer.toString(arr);
			
			if(s.charAt(0)=='1')
			{
				System.out.println(s);
			}
		}

	}

}
