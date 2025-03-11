package ibmAssesment;

public class ReverseTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="Hello";
		String s2 ="World";
		
		String rev=" ";
		String rev2=" ";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev = rev +s1.charAt(i);
		}
		
		System.out.println(rev);
		
		for(int j=s2.length()-1;j>=0;j--)
		{
			rev2 = rev2 +s2.charAt(j);
		}
		
		System.out.println(rev2);
	}

}
