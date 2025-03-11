package Practice;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =444;
		int on =444;
		int rev = 0;
		
		while(n!=-0)
		{
			rev = rev*10 + n%10;
			n = n/10;
		}
		
		System.out.println(rev);
		
		if (rev == on )
		{
			System.out.println("the number paligdrone");
			System.out.println(rev);
		}
		
		else
		{
			System.out.println("the number is not paligdrone");
		}
	}

}
