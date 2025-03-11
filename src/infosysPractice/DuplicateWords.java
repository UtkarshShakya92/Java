package infosysPractice;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDuplicatewords("Java is good and java is fun . Programing in java is great .");
	}
	
	public static void findDuplicatewords(String str )
	{
		String s = str.toLowerCase();
		String[] word = s.split(" ");
		
		int count =0;
		
		for(int i=0; i<word.length;i++)
		{
	        count =1;
	        
	        for(int j=i+1; j<word.length;j++)
	        {
			if(word[i].equals(word[j]))
			{
				count++;
				word[j]=" ";
			}
	        }
	        
	        if(count>=1 && word[i]!=" ")
	        {
	        	System.out.println(word[i]+" repeated "+count);
	        }
		}
		
		}
		
		
		
	}


