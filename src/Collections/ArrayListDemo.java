package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration 
		
		ArrayList mylist = new ArrayList();
		
		//List mylist = new ArrayList();
		
		//ArrayList<String> mylist = new ArrayList<String>();
		
		//Adding data to ArrayList
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//size of an ArrayList
		
		System.out.println("Size of an arraylist :"+mylist.size());
		
		//Printing data of arraylist 
		System.out.println("Pring data inside arraylist:"+mylist);
		
		////Remove element from arraylist
		
		mylist.remove(5);
		System.out.println("After Removing : Pring data inside arraylist:"+mylist);

		//Insert element in the arraylist
		
		mylist.add(2,"java");
		System.out.println("After adding : Pring data inside arraylist:"+mylist);
		
		//Modify element in the arraylist (modify/replace/change)
		
		mylist.set(2,"python");
		System.out.println("After modifying: "+mylist);
		
		//Access specific element from arraylist
		
		System.out.println(mylist.get(3));
		
		//Reading all the elements from arraylist
		
				//using normal for loop
		/*
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}*/
		
		//using for..each loop
		
		/*
		for( Object  x:mylist)
		{
			System.out.println(x);
		}
		*/
		
		// Using Iterator 
		
		    Iterator<Object> it =mylist.iterator();
		    
		    while(it.hasNext())
		    {
		    	System.out.println(it.next());
		    }
		    
		    
		  //Cheking arraylist is empty or not
			System.out.println("Is arraylist empty?"+ mylist.isEmpty());
			
			//remove all the elements from array list
			
			// removing multiple element and removing all from our created list 
			
			ArrayList mylist2 = new ArrayList();
			
			mylist2.add(100);
			mylist2.add("welcome");
			
			System.out.println("After removing multiple element :"+mylist2.removeAll(mylist2));
			
			//remove all the elemnts/clear
			mylist.clear();
			System.out.println("Is arraylist empty?"+ mylist.isEmpty());  //true
	}

}
