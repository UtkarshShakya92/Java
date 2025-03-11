package ArrayandStringPrograms;

import java.util.Arrays;

public class Practice {

	public static boolean isAnagram(String str1,String str2)
	{
		String s1 = str1.replace(" ","");
		
		String s2 = str2.replace(" ", "");
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Both strings are not anagram");
			return false;
		}
		
		else
		{
			char[] c1 = s1.toLowerCase().toCharArray();
			
			char[] c2 = s2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("Evil","live"));
		
		System.out.println(isAnagram("NOVA ","Av on"));
		
		System.out.println(isAnagram("Evil","lives"));
	}

}
