package Strings;

public class StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "WelcomeJava";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(s);
		int position =7;
		sb.insert(7,"To");
		
		s = sb.toString();
		
		System.out.println(s);
	}

}
