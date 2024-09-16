package Strings;

public class Palingdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welocome";
		
		System.out.println("the value of str is :"+ str);
		
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+ str.charAt(i);
		}
		
		System.out.println("the value of rev is :"+ rev);
		
		if(str.equals(rev))
		{
			System.out.println("the value "+ rev + "  is palingdrome of"+ str );
		}
		
		else
		{
			System.out.println("the value "+ rev + "  is not palingdrome of"+ str );
		}

	}

}
