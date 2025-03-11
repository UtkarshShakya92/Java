package ibmAssesment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Armstrong number is a number that is equal to the sum of cubes of its digits

		int number,original,result=0,reminder;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		number = sc.nextInt();
		
		original = number;
		
		while(number !=0)
		{
			reminder = number%10;
			result = (reminder*reminder*reminder)+result;
			number = number/10; 
		}
		
		if(result == original)
		{
			System.out.println("The Number is Armstrong");
		}
		
		else
		{
			System.out.println("The Number is not a Armstrong");
		}
	}

}
