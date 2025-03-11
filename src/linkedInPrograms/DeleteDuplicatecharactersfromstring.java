package linkedInPrograms;

public class DeleteDuplicatecharactersfromstring {

	///Delete Duplicate Characters From the string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Utkarsh Shakya";
		
		char[] ch = s.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0;i<s.length();i++)
		{
			int flag = 0;
			
			for(int j = i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					flag = 1;
					break;
				}
				
			}
			
			if(flag ==0)
			{
				sb.append(ch[i]);
			}
		}
		
		System.out.println(sb);
		
	}

}
