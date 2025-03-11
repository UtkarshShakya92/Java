package ArrayandStringPrograms;

import java.util.Arrays;

public class Anagram {

	
	public static boolean isAnagram(String s1,String s2)
	{
		String str1 = s1.replace(" ","");
		String str2 = s2.replace(" ", "");
		
		if(str1.length()!= str2.length() )
		{
		return false;
		}
		
		else
		{
		char[] c1 = str1.toLowerCase().toCharArray();
		
		char[] c2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		
		
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnagram("Listen","Silent"));
		
		System.out.println(isAnagram("Listen","Silen t"));
		
		System.out.println(isAnagram("LISTEN","Silen t"));
		
		System.out.println(isAnagram(" LISTEN","silent"));
		System.out.println(isAnagram(" LISTEN","silent  "));
		System.out.println(isAnagram("Tom","Jerry"));
		
	}

}
