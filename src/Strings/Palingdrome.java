package Strings;

public class Palingdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Madam";
		s = s.toLowerCase();
		System.out.println(s);
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		
		if(rev.equals(s))
		{
			System.out.println("String is pallingdrone");
		}
		
		else
		{
			System.out.println("String is not pallingdrone");
		}

	}

}
