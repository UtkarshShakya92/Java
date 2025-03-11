package infosysPractice;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {34,67,45,98,23,45,-5,23,56,50,98,67}; 
		
		int high = Integer.MIN_VALUE;
		int secondhigh = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>high)
			{
				secondhigh = high;
				
				high = a[i];
			}
			
			if(a[i]>secondhigh && a[i]<high)
			{
				secondhigh = a[i];
			}
		}
		
		System.out.println("the second highest number is :"+ secondhigh);
	}

}
