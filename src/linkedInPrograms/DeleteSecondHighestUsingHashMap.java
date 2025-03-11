package linkedInPrograms;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteSecondHighestUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> map = new HashMap();
		
		map.put("A", 20);
		map.put("B", 50);
		map.put("C", 10);
		map.put("D", 40);
		map.put("E", 30);
		
		System.out.println(map);
		System.out.println(map.size());
		
		List<Map.Entry<String,Integer>> entrylist = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		/*Collections.sort(entrylist,new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(java.util.Map.Entry<String, Integer> o1, java.util.Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		*/
		System.out.println(entrylist);
		System.out.println(entrylist.get(4));
		
	}

}
