package ibmAssesment;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 22;
		
		for(int i=1;i<=n;i++)
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			
			else
			{
				System.out.println(i);
			}
		}
		
	}

}
