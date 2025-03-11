package infoPractice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 238;
		int on = n ;
		int result = 0;
		int reminder = 0;
		
		while(n!=0)
		{
			reminder = n%10;
			result = (reminder*reminder*reminder)+result;
			n = n/10;
		}
		
		if(result == on)
		{
			System.out.println("number is armstorng");
		}
		
		else
		{
			System.out.println("number is not a armstorng");
		}
	}

}
