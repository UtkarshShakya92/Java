package infoPractice;

public class MergeTwoStringsx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="WelcomeTo";
		
		String b = "Java";
		
		String c = a.concat(b);
		
		System.out.println(c);
		
		StringBuffer sb = new StringBuffer(c);
		
		sb.insert(7,"To");
		
		System.out.println(sb);
		
		c= c.replace("To","Programming");

		System.out.println(c);
		
		sb.replace(7, 9, "IN");
		
		System.out.println(sb);
		
		System.out.println(sb.charAt(2));
	}

}
