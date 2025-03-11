package Strings;

public class XYX {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*C objc = new C();
		objc.printVariables();*/
		
		A a = new A();
		B b = new B();
		
		System.out.println(a.xyz+" "+b.abc);
	}

}

 class A
{
	static String xyz = " i am in class A";
	
	}
 
 class B
 {
	 static String abc =" i am from class B ";
 }
 
 class C
 {
	 public void printVariables()
	 {
		 System.out.println(A.xyz + "  "+B.abc);
	 }
 }
