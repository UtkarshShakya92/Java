package Strings;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //declare1
		String s ="Welcome";
		//declare2
		//String s = new String("Welcome");
		System.out.println(s);
		
		Object a[] = {"welcome"};
		System.out.println(a.length);
		
		
		//lenght() -- returns the length of string 
		
	      System.out.println(s.length());
	      
	    // Concatination ---
	      
	     String s1 ="Welcome ";
	     String s2 ="to java ";
	     String s3 ="Automation";
	     
	     System.out.println(s1+s2+s3);
	     //using concat()
	     
	     System.out.println(s1.concat(s2));
	     
	     System.out.println(s1.concat(s2).concat(s3));
	     
	     // trim() -- remove left and right side spaces
	     
	     s = "   automation    ";
	     System.out.println(s.length());
	     System.out.println(s.trim());
	     System.out.println(s.trim().length());
	     
	     //charAt() -- returns character based on index we passed
	     // index count starts from 0
	     
	     s="welcome";
	     System.out.println(s.charAt(0));
	     System.out.println(s.charAt(3));
	     
	     // contains() --- returns boolean value
	     
	     System.out.println(s.contains("wel"));//true
	     System.out.println(s.contains("com"));//true
	     System.out.println(s.contains("Wel"));//false
	     
	     //equals() , equalIgnoreCase() ;---compare two strings 
	     // return boolean value 
	     
	     s1 ="WELCOME";
	     s2 ="welcome";
	     
	     System.out.println(s1.equals(s2));//false
	     System.out.println(s1.equalsIgnoreCase(s2));//true
	     
	     //replace()  --replace single/multiple character from a string
	     
	     s="welcome to selenium automation testing and selenium training institute ";
	     
	     System.out.println(s.replace('e','X'));
	     System.out.println(s.replace("selenium","java"));
	     
	     //substring() -- to extract substring from main string 
	     // starting index starts with 0 , but ending index starts with 1
	     //    0123456
	     //    welcome
	     //    1234567
	     
	     s="welcome";
	     System.out.println(s.substring(3,7));
	     System.out.println(s.substring(2,6));
	     
	     //split() --devide the string into multiple parts using delimeters
	     //should not use * $ ^ . + -
	     s="abc@gmail.com";
	     String d[]=s.split("@");
	     System.out.println(d[0]);//abc
	     System.out.println(d[1]);// gmail.com
	}

}
