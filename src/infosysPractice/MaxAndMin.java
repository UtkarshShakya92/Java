package infosysPractice;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {45,20,10,5,67,33,90,10,60};
		
		int max =a[0];
		int min = a[0];
		
		for(int i=1; i<a.length;i++)
		{
			if(max< a[i])
			{
				max = a[i];
			}
			
			else if(min> a[i])
			{
				min = a[i];
			}
		}
		
		System.out.println("Max value is:"+ max);
		
		System.out.println("Min value is:"+ min);
	}
}
