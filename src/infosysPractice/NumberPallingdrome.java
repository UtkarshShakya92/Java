package infosysPractice;

public class NumberPallingdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =444;
		
		int on = a;
		int rev = 0;
		
		while(a!=0)
		{
			rev = rev*10 + a%10;
			
			a = a/10;
		}
		

		if(rev == on)
		{
			System.out.println(" the number is pallingdrome");
		}
		
		else
		{
			System.out.println(" the number is not pallingdrome");
		}
	}

}
