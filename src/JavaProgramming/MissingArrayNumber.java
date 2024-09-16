package JavaProgramming;

public class MissingArrayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {7,8,3,2,1,5,6};
		
		int sum1 =0;
		
		for(int i=0; i<a.length;i++)
		{
			sum1 = sum1 + a[i];
		}
		
		System.out.println("Sum of number present in array is :"+ sum1);
		
		int sum2 =0;
		
		for(int i =1;i<=8;i++)
		{
			sum2 = sum2+ i;
		}
		
		System.out.println("Sum of number present inclluding missing no in array is :"+ sum2);
		
		int missing_number = sum2 - sum1;
		
		System.out.println("Missing number is  :"+ missing_number);
	}

}
