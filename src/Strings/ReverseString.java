package Strings;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="selenium";
		String rev = " ";
		
		/*for(int i=s.length()-1;i>=0;i--)
		{
		     rev =rev+s.charAt(i);
		}
	       System.out.println("Reverse String :"+ rev); */
		
		char a[]= s.toCharArray();
		
		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev = rev+ a[i];
		}
		System.out.println("Reverse String :"+ rev);
	}

}
