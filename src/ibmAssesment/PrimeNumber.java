package ibmAssesment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for(int i=2;i<=100;i++)
		{
			boolean flag = false;
			
			for(int j=2;j<i;j++)
			{
				if(i%j == 0)
				{
					flag =true;
					
					break;
				}
			}
			
			if(flag== false)
			{
				count++;
				System.out.println(i);
			}
					
		}
		
		System.out.println("Total prime count :"+count);
	}

}
