package infoPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DeleteDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Sam went went to to to his bussiness";
		
		s = s.toString();
		
		String[] word = s.split(" ");
		System.out.println(Arrays.toString(word));
		
		/*
		LinkedHashSet<String> s1 = new LinkedHashSet<>();
		
		for(int i=0;i<word.length;i++)
		{
			s1.add(word[i]);
		}
		
		for(String ss : s1)
		{
			System.out.print(ss+ " ");
		}
		
		//System.out.println();*/
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<word.length;i++)
		{
			boolean flag = true;
			
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					flag = false;
					break;
				}
			}
			
			if(flag == true)
			{
				sb.append(word[i]);
			}
		}
		
		System.out.println(sb+" ");
	}

}
