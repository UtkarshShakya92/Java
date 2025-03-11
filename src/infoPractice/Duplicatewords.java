package infoPractice;

import java.util.Arrays;

public class Duplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java is good Java is fun Programming in java is great ";
		
		s = s.toLowerCase();
		
		String[] word = s.split(" ");
		System.out.println(Arrays.toString(word));
		int count =0;
		
		for(int i=0;i<word.length;i++)
		{
			count =1;
			
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
					word[j] =" ";
				}
			}
			
			if(count>=1 && word[i]!=" ")
			{
				System.out.println(word[i]+" : "+count);
			}
		}
		
	}

}
