package Practice;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2023;
		
		if((year%4==0)||(year%400==0)&& year %100 !=0)
		{
			System.out.println("The year is leap year");
		}
		
		else
		{
			System.out.println("The year is not a leap year");
		}
	}

}
