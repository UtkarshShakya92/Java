package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		hs.add(100);
		hs.add("deepak");
		hs.add(200);
		hs.add("Utk");
		hs.add(300);	
		System.out.println(hs);
		
		ArrayList al = new ArrayList(Arrays.asList("one ",10,25,"two","Three",25,"deepak",100));
		
		
		
		System.out.println(al);
		
		//HashSet hs = new HashSet(al);
		System.out.println(hs);
		
		hs.addAll(al);
		
		System.out.println(hs);
		
		Iterator it  = hs.iterator();
		
		hs.remove(100);
		
		System.out.println(hs);
		
		
	}

}
