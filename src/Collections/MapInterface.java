package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map m = new HashMap();
		
		m.put(101,"Deepak");
		m.put(102,506);
		m.put(103,"Amit");
		m.put(104,"Utk");
		m.put(105,"Durga");
		m.put(101,"Rahul");
		System.out.println(m);
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());
	}

}
