package Practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 79;
		
		if(n>1)
		{
			boolean flag = true;
			
			for(int i=2; i<n-1;i++)
			{
				if(n%i == 0)
				{
					flag = false;
					break;
				}
			}
			
			if(flag == true)
			{
				System.out.println("The number" + n + " is prime");
			}
			
			else
			{
				System.out.println("The number" + n + " is not a prime");
			}
			
		}
		
		else
		{
			System.out.println("Enter number greater than 1");
		}
	}

}
