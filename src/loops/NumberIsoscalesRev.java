package loops;

public class NumberIsoscalesRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k =1;
		for(int i=1;i<5;i++)
		{
			
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
