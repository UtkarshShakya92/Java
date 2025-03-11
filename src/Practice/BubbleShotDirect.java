package Practice;

import java.util.Arrays;

public class BubbleShotDirect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,15,30,13,15,20,3,32,22};
		
		System.out.println("Before sorting"+ Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
		System.out.println("After sorting"+ Arrays.toString(a));
	}

}
