package Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,6,3,9,8,7,4};
		
		int sum=0;
		
		/*for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i]; 
			
		}

		System.out.println("Total sum of array is :"+ sum);
		*/
		
		for(int i:a)
		{
			sum = sum+ i ;
			
		}
		
		System.out.println("Total sum of array is :"+ sum);
		
	}

}
