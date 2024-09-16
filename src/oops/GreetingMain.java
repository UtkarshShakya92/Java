package oops;

public class GreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting gr = new Greeting();
		
		gr.greeting1(); //1
		
		String str=gr.greeting2(); //2
		System.out.println(str);
		
		System.out.println(gr.greeting2());//2
		
		gr.greeting3("Jhon");//3
		String str1=gr.greeting4("John");//4
		System.out.println(str1);
	}

}
