package Methods;

public class MethodsDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo md = new MethodsDemo();
		
		md.m1();
		
		String s =md.m2();  //for calling the method with return type , we have to store the return value in a 
		// related variable .
		System.out.println(s);
		//or
		System.out.println(md.m2());// or we can directly call on output return value.
		
		md.m3("John");
		
		String s1 =md.m4("David");
		System.out.println(s1); 

	}

}
