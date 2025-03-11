package infoPractice;

public class SecondHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {10,20,30,40,50,40,50,40,50};
		
		int high = Integer.MIN_VALUE;
		
		int sechigh = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>high)
			{
				sechigh = high;
				high = a[i];
				}
			
			if(a[i]> sechigh && high>a[i])
			{
				sechigh = a[i];
			}
		}

		System.out.println(sechigh);
	}

}
