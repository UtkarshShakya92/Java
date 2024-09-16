package JavaProgramming;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1,2,4,5};
		
		int sum1 =0;
		
		for(int i =0; i<a.length;i++)
		{
			sum1= sum1+a[i];
		}
		
		System.out.println("Sum of numbers present : "+sum1);

		int sum2 =0;
		
		for(int i=1;i<=5;i++)
		{
			sum2 = sum2+i;
		}
		
		System.out.println("Sum of range of numbers : "+sum2);
		System.out.println("Missing Number is : "+(sum2-sum1));
	}

}
