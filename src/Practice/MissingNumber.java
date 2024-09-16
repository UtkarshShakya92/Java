package Practice;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {5,6,7,9,10};
		
		int sum1=0, sum2 =0;
		
		for(int i=0;i<a.length;i++)
		{
		  sum1 = sum1+a[i];
		}
		
		for(int i=5;i<=10;i++)
		{
			sum2 =sum2+i;
		}
		
		int no = sum2-sum1;
		System.out.println(no);
	}

}
