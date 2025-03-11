package infoPractice;

public class VowelandConsonentCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vCount =0; int cCount=0;
		
		String s = "Today we will Learn Java";
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'
					|| s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vCount++;
			}
			
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				cCount++;
			}
		}
		
		System.out.print("Vowel count : "+vCount +" "+"Consonent Count: "+cCount);
	}

}
