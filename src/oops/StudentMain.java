package oops;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Student stu = new Student();
		//Approach 1  : Using Reference variable
		
		stu.sid=101;
		stu.sname="John";
		stu.sgrade= 'A';  */
		
		// Approach 2: Using Method 
		
		//stu.SetData(102,"Utk", 'A');
		
		// Approach 3 : Using Constructor
		
		Student stu = new Student(101,"Jhon",'A');
		stu.show();
		

	}

}
