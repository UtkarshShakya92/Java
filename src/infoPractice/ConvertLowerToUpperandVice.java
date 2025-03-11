package infoPractice;

public class ConvertLowerToUpperandVice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "CloudTech";
		
		StringBuffer sb = new StringBuffer(s);
		
		for(int i=0;i<sb.length();i++)
		{
			Character ch =sb.charAt(i);
			if(Character.isUpperCase(ch))
			{
				sb.setCharAt(i, Character.toLowerCase(ch));
			}
			
			
			
			else
			{
				sb.setCharAt(i, Character.toUpperCase(ch));
			}
		}
		
		System.out.println(sb);
	}

}
