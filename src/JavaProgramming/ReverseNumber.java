package JavaProgramming;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("The reverse of number is :"+ rev);
		
		
	}

}
