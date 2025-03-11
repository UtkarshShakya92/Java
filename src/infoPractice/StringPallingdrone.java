package infoPractice;

public class StringPallingdrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Madam";
		String s1 =s.toLowerCase();
		String rev ="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
		if(s1.equals(rev))
		{
			System.out.println("The given String is pallingdrome");
		}
		
		else
		{
			System.out.println("The given String is not a pallingdrome");
		}
	}

}
