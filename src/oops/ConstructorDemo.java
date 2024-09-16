package oops;

public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo()
	{
		x =10;
		y =20;
		
	}
	
	ConstructorDemo(int a, int b)
	{
		x= a;
		y = b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}

}
