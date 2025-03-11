package infoPractice;

public class Stringpallingdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Madam";
		
		String sh = s.toLowerCase();
		
		String rev ="";
		
		for(int i=sh.length()-1;i>=0;i--)
		{
			rev = rev+sh.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equals(sh))
		{
			System.out.println("String is pallingdrome");
		}
	}

}
