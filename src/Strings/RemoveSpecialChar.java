package Strings;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "!@$%$%$ Welcome to @#@$#@%^&^*^&* Java";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);

	}

}
