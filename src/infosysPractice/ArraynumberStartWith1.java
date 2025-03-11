package infosysPractice;

public class ArraynumberStartWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,23,34,123,167,45,67,145,78,190,111};
		
		for(int arr :a)
		{
			String s = Integer.toString(arr);
			
			if(s.charAt(0)=='1')
			{
				System.out.println(s);
			}
		}

	}

}
