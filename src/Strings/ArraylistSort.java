package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArraylistSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>(Arrays.asList("Orange","Apple","Banana","Kiwi"));
		
		System.out.println(al);
		al.sort(Comparator.naturalOrder());
		System.out.println(al);
		
		
		
	}

}
