package infoPractice;

public class NumberPalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12321;
		
		int orig = num;
		
		int rev =0;
		
		while(num!=0)
		{
			rev = rev*10+ num%10;
			num = num/10;
		}
		
		if(rev == orig)
		{
			System.out.println("Number is pallingdrome");
		}

	}

}
