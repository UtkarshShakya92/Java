package infoPractice;

public class DeleteDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Geeksforgeeksprogramming";
		
		s= s.toLowerCase();
		
		char[] ch = s.toCharArray();
		
		System.out.println(ch);
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<ch.length;i++)
		{
			boolean flag = true;
			for(int j =i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					flag = false;
					break;
				}
			}
			
			if(flag == true)
			{
				sb.append(ch[i]);
			}
		}
		
		System.out.println(sb);
	}

}
