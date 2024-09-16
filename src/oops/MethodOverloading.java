package oops;

public class MethodOverloading {

	int x,y,z;
	double d;
	
	void sum()
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
	
	void sum(int a , int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a , double b)
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	void sum(double b, int a)
	{
		x=a;
		d=b;
		System.out.println(x+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		MethodOverloading mo = new MethodOverloading();
		
		mo.sum();//1
		mo.sum(100,200);//2
		mo.sum(10.5,10);//4
		mo.sum(20,12.5);//3
	}

}
