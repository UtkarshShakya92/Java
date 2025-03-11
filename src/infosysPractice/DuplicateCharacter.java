package infosysPractice;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		duplicateChar("Geeksforgeeks");
	}
	
	public static void duplicateChar(String str)
	{
		
		String s = str.toLowerCase();
		
		char[] c = s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<c.length;i++)
		{
			boolean flag = false;
			
			for(int j= i+1; j<c.length;j++)
			{
				if(c[i] == c[j] && c[i]!=' ')
				{
					flag = true;
					break;
				}
			}
			
			if(flag == false)
			{
				sb.append(c[i]);
			}
		}
		
		System.out.println(sb);
	}

}
