package JavaProgramming;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Test Automation Central";
		
		String vowels ="aeiouAEIOU";
		
		String output =" ";
		
		for(char c: s.toCharArray())
		{
			
			if(vowels.indexOf(c)== -1)
			{
				output = output + c;
			}
			
		}
		
		System.out.println(output);
		
	}

}
