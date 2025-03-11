package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapStringListSstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,List<String>> m = new HashMap();
		
		m.put("Fruits",Arrays.asList("Apple","Mango"));
		m.put("Vegetables", Arrays.asList("Carrot","Raddish"));
		
		System.out.println(m);
		
		System.out.println(m.keySet());
		
		System.out.println(m.values());
		
		for(Map.Entry m1: m.entrySet())
		{
			System.out.println(m1.getKey()+"---"+m1.getValue());
		}
	}

	

}
