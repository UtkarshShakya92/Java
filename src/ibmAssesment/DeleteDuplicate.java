package ibmAssesment;

public class DeleteDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Programming is the key for success";
		
		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<ch.length;i++)
		{
			boolean repeated = false;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					repeated =true;
					break;
				}
			}
			
			if(!repeated)
			{
				sb.append(ch[i]);
			}
		}
		
		System.out.println(sb);

	}

}
