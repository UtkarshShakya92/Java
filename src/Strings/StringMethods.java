package Strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello";
		
		String b ="hello";
		
		System.out.println(a+" "+b);
		
		System.out.println(a.equals(b));
		
		String s1 = new String("hello");
		
		String s2 = new String("hello");
		
		System.out.println(s1.equals(a));
		
		System.out.println(s1==(a));
		
		String s = "javatraining";
		
		System.out.println(s.charAt(2));
		
		System.out.println(s.indexOf("t"));
		
		System.out.println(s.substring(3, 6));
		
		 s = s.substring(4);
		 System.out.println(s);
		 
		 // s.concat(" By Rahul");

		 System.out.println(s.concat(" By Rahul"));
		 
		 System.out.println(s);

	}

}
