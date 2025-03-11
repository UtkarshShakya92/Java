package infosysPractice;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=153;
		int original ;
		int reminder, result =0;
		
		original = number;
		
		while(number!=0)
		{
			reminder = number%10;
			result = (reminder*reminder*reminder)+result;
			
			number = number/10;
		}
		
		if(result == original)
		{
			System.out.println("Number is Armstrong"); 
		}
		
		else
		{
			System.out.println("Number is not Armstrong"); 
		}
	}

}
