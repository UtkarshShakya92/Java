package Practice;

public class ReverseEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome To Java";
		
		String[] words = s.split(" ");
		
		String revString ="";
		
		for(String w : words)
		{
			String revword ="";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				revword = revword+ w.charAt(i);
			}
			
			revString = revString + revword + " ";
		}
		
		System.out.println(revString);

	}

}
