package oops;

public class Greeting {
	
	//No param no return
	
	void greeting1()
	{
		System.out.println("Hi this is greeting1 method");
		
	}

	// no param but with return value
	
	String greeting2()
	{
		return "Hi this is greeting2 method";
	}
	
	//Takes param but no return 
	
	void greeting3(String name)
	{
		System.out.println("Hello.."+name);
	}
	
	String greeting4(String name)
	{
		return "hello.."+name ;
	}
}

