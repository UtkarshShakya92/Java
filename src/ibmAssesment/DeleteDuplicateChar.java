package ibmAssesment;

public class DeleteDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		duplicateChar("Geeksforgeeks");
		
	}

	
	public static void duplicateChar(String str)
	{
          //String str = "Geeksforgeeks";
		
		String str1 = str.toLowerCase();
		
		char[] ch = str1.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<ch.length;i++)
		{
			boolean flag = false;
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
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

