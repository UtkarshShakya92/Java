package JavaProgramming;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello Automation";
		
		String rev = " ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println("the reverse string is : "+ rev);
	}
}