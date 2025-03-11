package infoPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicateUsingLinkedHashSet {

	public static void main(String[] args) {
		
	int []a = {3,5,2,6,4,8,2,6,55,44,5,33,8,6,3,9};
	
	LinkedHashSet<Integer> lsh = new LinkedHashSet<Integer>();
	
	for(int i=0;i<a.length;i++)
	{
		lsh.add(a[i]);
		
	}
	
	System.out.println(lsh);
	
	}
}
