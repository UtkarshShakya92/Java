package Arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//approcah1
		/*
		int a[][] =new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		//approach 2
		int a[][]= {{100,200},{300,400},{500,600}};
		
		//find the length of 2darray
		
		System.out.println(a.length);//3
		System.out.println(a[0].length);//2
		
		//read specific data
		
		System.out.println(a[2][0]);  //500
		
		//read all data using classic for loop
		
		/*for(int r=0;r<a.length;r++)
		{
			for(int c=0; c<a[r].length;c++)
			{System.out.print(a[r][c]+"  ");}
			System.out.println();
		}*/
		
		// reading data of 3d using enhanced for loop
		
		for(int x[] :a)
		{
			for(int v : x)
			{
				System.out.println(v);
			}
		}
	}

}
