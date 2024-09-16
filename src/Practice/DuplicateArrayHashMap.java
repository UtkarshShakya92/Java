package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateArrayHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a []= {10,20,30,40,20,50,60,30,20,30};
		
		Map<Integer,Integer> hm = new HashMap<>();
		
		for(Integer no :a)
		{ 
			Integer count = hm.get(no);
			if(count == null)
			{
				hm.put(no, 1);
			}
			
			else
			{
				count = count+1;
				hm.put(no, count);
			}
		}
		
		Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
		
		for(Map.Entry<Integer,Integer> me : es)
		{
			if(me.getValue()>1)
			{
				System.out.println(me.getKey());
			}
				
		}
		
	}

}
