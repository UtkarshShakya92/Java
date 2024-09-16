package Practice;

public class PrimeNumberInARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int count =0;
		
		for(int i=500;i<=1000;i++)
		{
			boolean flag =true;
			
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
			 System.out.println("The number is prime :"+i);
		 }
		 
		}
		
		System.out.println("The total prime numbers present are :"+count);
		
		
		
	}
}
