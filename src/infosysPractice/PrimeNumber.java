package infosysPractice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		
		for(int i=2;i<=100;i++)
		{
			boolean flag = true;
			
			for(int j=2;j<i;j++)
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
				System.out.println(i);
			}
			
		}
		
		System.out.println("total count :"+ count);
	}

}
