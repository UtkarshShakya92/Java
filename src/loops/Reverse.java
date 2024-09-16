package loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		/*
		//using algorithm
		
		int rev = 0;
		while(num!=0)
		{
		  rev = rev*10 + num%10 ; // 0+ 1234%10=4; 4*10=40+3 =43; 43*10=430+ 2 =432 ; 432*10+ 1= 4321 ;
		  num = num/10 ; //1234/10 =123 ; 123/10 = 12 ; 12/10=1 ; 1/10=0 ; 
		}
		*/
		 /*
		// using StringBuffer Class
		
	    StringBuffer sb = new StringBuffer(String.valueOf(num));
	    StringBuffer rev = sb.reverse();
	    
		System.out.println("Reverse of the Number is : " + rev);
		*/
		
		//Using StringBuilder Class
		
		StringBuilder sbl = new StringBuilder();
		
		sbl.append(num);
		
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reverse of the Number is : " + rev);
		

	}

}
