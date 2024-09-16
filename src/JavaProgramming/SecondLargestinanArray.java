package JavaProgramming;

import java.util.Arrays;

public class SecondLargestinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {10,20,44,22,-5,78,99,30,99};
		
		int n =num.length;
		
		//sorting the array 
		
		Arrays.sort(num);
		
		//displaying the second largest 
		
		System.out.println(num[n-2]);
		
		// in this type of program if we repeat highest number twice like 99 two time , the second highest will come 99 as we are picking from index

		 
	}

}
