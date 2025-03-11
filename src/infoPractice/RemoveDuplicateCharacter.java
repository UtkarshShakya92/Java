package infoPractice;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		removeDuplicate("geeks for Geeks");
	}
	
	public static void removeDuplicate(String str)
	{
		String s = str.toLowerCase();
		
		char[] ch = s.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i =0;i<ch.length;i++)
		{
			boolean flag = false;
			
			for(int j =i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j] && ch[i]!=' ')
				{
					flag = true;
					break;
				}
			}
			
			if(flag == false)
			{
				sb.append(ch[i]);
			}
		}
		
		System.out.println(sb);
	}

}
