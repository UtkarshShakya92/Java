package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList al1 = new ArrayList();
		/*al1.add(0,10);
		al1.add("deepak");
		al1.add(20);
		al1.add(40);
		System.out.println(al1);
		*/
		
		ArrayList al = new ArrayList(Arrays.asList(50,60,20,40,10,"deepak","Utk"));
		System.out.println(al);
		
		al.remove(5); 
		System.out.println(al);
	}

}
