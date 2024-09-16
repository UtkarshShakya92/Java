package Collections;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration 
		
		//HashMap hm = new HashMap();
		
		//Map hm = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//Adding pair 
		
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"Mary");
		hm.put(104,"Scott");
		hm.put(102,"David");
		
		System.out.println(hm);
		
		//size
		System.out.println(hm.size());
		
		//remove a pair
		
		hm.remove(103);
		System.out.println(hm);
		
		//access value of the key
		
		System.out.println(hm.get(102));
		
		//get all the keys /values/ key+values 
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		//reading data from hashmap
		
		//for each loop
		
		for(int k:hm.keySet())
		{
			System.out.println(k +"   "+hm.get(k));
		}
		
		//Using Iterator
		
				Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
				
				while(it.hasNext())
				{
					Entry<Integer,String> entry=it.next();
					System.out.println(entry.getKey()+"     "+entry.getValue());
				}
				
				hm.clear();
				System.out.println(hm.isEmpty()); //true

	}

}
