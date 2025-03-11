package infoPractice;

public class StringRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I Love Dogs";
		
		String s =str.replace(" ",""); 
		
		System.out.println(s.charAt(0));
		System.out.println(s); 

		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				System.out.print(s.charAt(i)+""+s.charAt(j)+", ");
			}
		}
		
		System.out.println();
	}
	

}
