package Practice;

import java.util.Arrays;

public class ArrayNumberStratswith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,34,23,123,45,167};
		
		for(int arr : a)
		{
			String s = Integer.toString(arr);
			
			if(s.charAt(0)=='1')
			{
				System.out.println(s);
			}
		}
	}

}
