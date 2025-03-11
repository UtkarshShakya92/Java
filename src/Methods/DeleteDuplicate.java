package Methods;

import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s = "Java is programming language java is fun";
		
		String[] words = s.split(" ");
		
		StringBuffer sb =  new StringBuffer();
		
		for(int i=0;i<words.length;i++)
		{
			boolean flag = false;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i] == words[j])
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
		
		System.out.println(sb);*/
		
		String sen = "Sam went went to to to his business";
        String[] arr = sen.split(" ");
        //arr={Sam,went,went,to,to ,to ,his ,business};
        Set<String> s = new LinkedHashSet<String>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        for(String ss:s)
        {
            System.out.print(ss+" ");
        }
        System.out.println();
    }   
	}
		


