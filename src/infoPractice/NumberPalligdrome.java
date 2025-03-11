package infoPractice;

public class NumberPalligdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1234321;
		int on = n;
		int rev =0 ;
		
		while(n!=0)
		{
			rev = rev*10 + n%10;
			n = n/10;
		}
		
		System.out.println(rev);
		
		if(rev == on)
		{
			System.out.println("the number is pallingdrone");
		}
		
		else
		{
			System.out.println("the number is not  pallingdrone");
		}
	}

}
