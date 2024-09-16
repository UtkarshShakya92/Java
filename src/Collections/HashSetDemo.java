package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration 
		
		HashSet myset = new HashSet();
		
		//Set myset = new HashSet();
		
		//for hetrogenous data
		//HashSet<String> myset = new HashSet <String>();
		

		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);//[null, A, 100, 10.5, welcome, true]
		
		//Removing element /object 
		
		myset.remove(10.5);
		System.out.println("After removing the object 10.5 : "+ myset);
		
		//convert hashset to arraylist
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		
		System.out.println(al.get(2));
	}

}
