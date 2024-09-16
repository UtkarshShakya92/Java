package Practice;

public class EvenOddfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {10,15,30,25,13,12,14,50,60,44,22,31};
		
		System.out.println("Total numbers present in array are "+ a.length);
		int evencount =0; int oddcount =0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 ==0)
			{
			System.out.println("The "+a[i]+" is even");
			
			evencount++;
			}
			
			else if(a[i]%2 !=0)
			{
				System.out.println("The "+a[i]+" is odd");
				oddcount++;
			}
		}
		
		System.out.println("Total number of even numbers ==" + evencount);
		System.out.println("Total number of even numbers ==" + oddcount);
	}

}
