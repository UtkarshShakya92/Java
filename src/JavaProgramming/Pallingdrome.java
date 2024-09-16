package JavaProgramming;

public class Pallingdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "MADAM";
		
		String rev = " ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}

		if(s.equals(rev))
		{
			System.out.println(rev + " is a pallingdrone ");
		}
		
		else
		{
			System.out.println(rev + " is not a pallingdrone ");
		}
	}

}
