package JavaProgramming;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vCount =0,cCount=0;
		
		String s = "Today we will learn Simple Java";
		
		s = s.toLowerCase();
		
		System.out.println(s);
		System.out.println(s.length());
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)== 'a'||s.charAt(i)== 'e'||s.charAt(i)== 'i'||s.charAt(i)== 'o'||s.charAt(i)== 'u' )
			{
				vCount++;
			}
			
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				cCount++;
				
			}
		}
		
		System.out.println("Vowels count : " + vCount +" "+ "Consonants count: "+cCount );
	}

}
