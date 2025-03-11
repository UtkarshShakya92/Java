package infosysPractice;

public class PrintSmallLetterCpitalLetterSeperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "sumitM28";
		
		char[] c = s.toCharArray();
		
		for(char ch :c)
		{
			if(ch>90)
			{
				System.out.print(ch);
			}
			
		}
		System.out.println();
		
		for(char ch : c)
		{
			if(ch>=65 && ch<=90)
			{
				System.out.print(ch);
			}
		}
		System.out.println();
		
		for(char ch : c)
		{
			if(ch<65)
			{
				System.out.print(ch);
			}
			
		}
	}

}
