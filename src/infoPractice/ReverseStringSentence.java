package infoPractice;

public class ReverseStringSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to java programming";
		
		String[] s = str.split(" ");
		
		String rev = " ";
		
		for(int i=s.length-1;i>=0;i--)
		{
			if(i==0)
			{
				rev = rev+s[i];
			}
			
			else
			{
			rev = rev+s[i]+" ";
			}
		}
		
		System.out.println(rev);
	}

}
