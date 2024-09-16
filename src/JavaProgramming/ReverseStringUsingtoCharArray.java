package JavaProgramming;

import java.util.Arrays;

public class ReverseStringUsingtoCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "olleh";
		
		String rev = " ";
		
		char a[] = s.toCharArray();
		System.out.println(Arrays.toString(a));
		
		for(int i =a.length-1;i>=0;i--)
		{
			rev = rev + a[i];
		}
		System.out.println("rev is :"+ rev);
	}

}
