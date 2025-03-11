package ibmAssesment;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "gooood lifeee";
		
		int count =0;
		
		char[] ch = str.toCharArray();
		
		System.out.println("Duplicate Characters in a given string are:");
		
		for(int i=0;i<ch.length;i++)
		{
			count =1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					//set ch[j] to 0 , so this will avoid printing repeated character twice
					ch[j]='0';
				}
				
			}
			
			if(count>1 && ch[i]!='0')
			{
				System.out.println(ch[i]+" : "+count );
				
			}			
			
		}
					
	}

}
