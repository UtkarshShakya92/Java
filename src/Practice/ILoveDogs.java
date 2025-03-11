package Practice;

public class ILoveDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I Love Dogs";
		
		String st = s.replace(" ","");
		
		for(int i=0;i<st.length();i++)
		{
			
			for(int j=0;j<st.length();j++)
			{
				System.out.print(st.charAt(i)+""+st.charAt(j)+ ",");
				
			}
			
			System.out.println();
			
		}
	}

}
