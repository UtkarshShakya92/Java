package Practice;

public class MaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,40,120,80,100,110};
		int max = a[0];
		int min =a[0];
		for(int i=1; i<a.length;i++)
		{
			if( a[i] > max)
			{
				max = a[i];
			}
			
			else if(a[i]<min)
			{
				min = a[i];
			}
			
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
