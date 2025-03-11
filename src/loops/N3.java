package loops;

public class N3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int k=3;
		for(int i=1;i<5;i++)
		{
			
			for(int j=1;j<=5-i;j++)
			{
				
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++)
				
                {
				
				System.out.print(" *");
				
			    }
			System.out.println();
		}
	}

}
