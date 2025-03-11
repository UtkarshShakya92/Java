package Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Sam went to to to Market";
	
		String[] s = str.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		
		System.out.println(set.toString());
		
		
	}

}
