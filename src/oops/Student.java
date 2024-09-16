package oops;

public class Student {

	int sid ;
	String sname ;
	char sgrade;
	
	void show()
	{
		System.out.println(sid+"   "+sname+"   "+sgrade);
	}
	
	//For Method Approach
	
	void SetData(int id , String name , char g)
	{
		sid = id;
		sname = name;
		sgrade = g;
	}
	
	Student(int id , String name , char g)
	{
		sid = id;
		sname = name;
		sgrade = g;
	}
}
