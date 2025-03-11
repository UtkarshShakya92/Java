package ArrayandStringPrograms;

public class ValidNumber {

	public static boolean isNumber(String number)
	{
		try
		{
		Long.parseLong(number);
		System.out.println("This number is valid: "+number);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("This number is not valid: "+number);
			return false;
		}
		
		return true;
		
	}
	
	public static boolean isValidPhoneNumber(String number)
	{
		if(number.length() == 10 && isNumber(number))
		{
			System.out.println("The ph number is Valid: "+ number);
			return true;
		}
		
		else
		{
			System.out.println("The ph number is not Valid: "+ number);
		}
		
		return false;
	}
	
	public static boolean isValidCCNumber(String number)
	{
		if(number.length()==16 && isNumber(number))
		{
			System.out.println("this is valid CC Number: "+number);
			return true;
		}
		
		else
		{
			System.out.println("this is not a valid CC Number: "+number);
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isNumber("1234"));
		System.out.println(isValidPhoneNumber("1234567890"));
		
		System.out.println(isValidCCNumber("1234567890234556"));
	}

}
