package JavaProgramming;

public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =80;
		int b= 30; int c = 70;
		
		if(a>b && a>c)
		{
			System.out.println( a + ": is the largest number");
		}
		
		else if(b>a && b>c)
		{
			System.out.println( b + ": is the largest number");
		}
		
		else 
		{
			System.out.println( c + ": is the largest number");
		}
	}

}
