package Practice;

public class PrimeNumberInARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//1 to 100 // prime number is always greater than 1 so int i =2
		
		int count =0;
		
		for(int i=2; i<=100;i++)
		{
			boolean flag = true; 
			for(int j =2;j<i;j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}
			}
			
			if(flag == true)
			{
				count++;
				System.out.println("prime numbers : "+i);
			}
		}
		System.out.println("Total prime numbers : "+count);
		
	}
}
