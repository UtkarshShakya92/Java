package ibmAssesment;

public class FabonacciTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, n2 =1 ,sum=0;
		
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				//System.out.print(n2);
				
				sum =n1+n2;
				System.out.print(sum+" ");
				n1= n2;
				n2 =sum;
			}
			System.out.println();
		}
	}

}
