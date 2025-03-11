package Practice;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 153;
		int on = n;
		int reminder =0; int result =0;
		
		while(n!=0)
		{   
			reminder = n%10;
			result  = (reminder*reminder*reminder)+result;
			n = n/10;
		}
		
		if(on == result)
		{
			System.out.println("The number is armstrong");
		}
	}

}
