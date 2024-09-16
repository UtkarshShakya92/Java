package JavaProgramming;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b =20;
		
		System.out.println("Before swapping values are : "+a+"  "+b);
		/*
		//-- taking temp variable 
		int t =a;
		a=b;
		b=t;*/
		
		//logic two --using - and +
		
		a = a+b ;
		b = a-b;
		a= a-b;
		
		System.out.println("After swapping values are : "+a+"  "+b);
	}

}
