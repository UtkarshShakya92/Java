package Practice;

public class Duplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Geeksforgeeks";
		
		String s1 = s.toLowerCase();
		
		char[] ch = s1.toCharArray();
		
		StringBuilder sb =  new StringBuilder();
		
		for(int i=0;i<ch.length;i++)
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
