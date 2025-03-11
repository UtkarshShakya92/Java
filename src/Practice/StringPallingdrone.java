package Practice;

public class StringPallingdrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		
		String rev ="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(s))
		{
			System.out.println(s + "The provided string is Pallingdrome");
		}
		
		else
		{
			System.out.println(s + "The provided string is not a  Pallingdrome");
		}
	}
}
