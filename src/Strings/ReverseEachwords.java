package Strings;

public class ReverseEachwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java is better than Python";
		
		s =s.toLowerCase();
		
		String[] words = s.split(" ");
		
		String revString ="";
		
		for(String w: words)
		{
			String revword ="";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				revword = revword+w.charAt(i);
			}
			
			revString = revString+revword+" ";
		}
		
		System.out.println(revString);
	}

}
