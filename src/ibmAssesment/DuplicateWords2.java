package ibmAssesment;

public class DuplicateWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDuplicateWords("Java is great and Java is fun. Programming in Java is great.");
	}
	
	public static void findDuplicateWords(String str)
	{
		String s = str.toLowerCase();
		String[] word = s.split(" ");
		int count =0;
		for(int i=0;i<word.length;i++)
		{
			count=1;
			
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equalsIgnoreCase(word[j]))
				{
					count++;
					
					word[j]="0";
					
				}
			}
			
			if(count>1 && word[i]!="0")
				
			{
				System.out.println(word[i] +" : "+ count);
			}
		}
	}

}
