package ibmAssesment;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input string ");
		
		String str = sc.next();

		String str1 = str.toLowerCase();
		
		char[] ch = str1.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0 ;i<ch.length;i++)
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
