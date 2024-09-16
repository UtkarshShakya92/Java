package JavaProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<String>();
		l.add("Mango");
		l.add("Apple");
		l.add("Banana");
		l.add("Mango");
		
		System.out.println(l.toString());
		
		Set<String> s = new HashSet<String>(l);
		
		System.out.println(s);
	}

}
