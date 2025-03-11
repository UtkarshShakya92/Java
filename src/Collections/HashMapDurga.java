package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDurga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> m = new HashMap();
		
		m.put("chiranjeevi", 700);
		m.put("balaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna",500 );
		
		System.out.println(m);
		
		System.out.println(m.put("chiranjeevi", 1000));
		
		System.out.println(m);
		
		Set s = m.keySet();
		
		System.out.println(s);
		System.out.println(m.keySet());
		
		Collection c = m.values();
		
		System.out.println(c);
		
		//Set s1 = m.entrySet();
		
		//System.out.println(s1);
		
		/*Iterator itr = s1.iterator();
		
		while(itr.hasNext())
		{
			
			Map.Entry m1 = (Map.Entry) itr.next();
			
			System.out.println(m1.getKey()+"------"+m1.getValue());
			
			if(m1.getKey().equals("nagarjuna"))
			{
				m1.setValue(1000);
			}
		}
		*/
		for(Map.Entry m1: m.entrySet())
		{
			System.out.println(m1.getKey()+"------"+m1.getValue());
			if(m1.getKey().equals("nagarjuna"))
			{
				m1.setValue(1000);
			}
			System.out.println(m1.getKey()+"------"+m1.getValue());
		}
		
		System.out.println(m);
	}

}
