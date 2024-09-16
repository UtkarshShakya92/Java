package JavaProgramming;

public class PrimeNumberInaRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int i = 2; i <= 100; i++) 
		{
			int flag = 0;

			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) 
				{
					flag = 1;
					break;
				}	
			}

			if (flag == 0) 
			{
				count++;
				System.out.println(i);

			}

		}
		System.out.println("the totoal number of prime number present is :" + count);
	}

}
