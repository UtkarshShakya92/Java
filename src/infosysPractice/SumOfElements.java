package infosysPractice;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {34,56,78,23,45,89,8,30};
		int sum =0;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println("The sum od all elements :"+ sum);
	}

}
