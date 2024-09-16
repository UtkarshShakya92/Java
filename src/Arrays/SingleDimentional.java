package Arrays;

import java.util.Arrays;

public class SingleDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/* Approach 1
		int a[] = new int[5]; //declare
		
		a[0]= 100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		*/
		
		//Approcah 2
		
		int a[]= {100,200,300,400,500,600};
		
		//size/length  of an array
		// by method (length)
		
		System.out.println(a.length); //6
		
		//perticular value from array
		
		System.out.println(a[3]);//400
		
		// retrive all values 
		//approcah 1
		
		System.out.println(Arrays.toString(a));//[100, 200, 300, 400, 500, 600]
		
		//approach2 using for loop
		
		/*for(int i=0; i<=(a.length-1);i++)
		{
			System.out.println(a[i]);
		}*/
		
		//Enhanced for loop
		
		for(int x: a)
		{
			System.out.println(x);
		}
	}

}
