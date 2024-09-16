package Arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,30,5,23,12, 10,15};
		
		int sum =0;
		
		/*for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		*/
		
		for(int x :a)
		{
			sum = sum + x;
		}
		System.out.println("The Sum of array element is :"+sum);
	}

}
