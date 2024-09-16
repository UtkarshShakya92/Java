package Methods;

public class Student {

	int sid ;
	String sname;
	char grade;
	
	void PrintStudentData()
	{
		System.out.println(sid+"  "+sname+"  "+grade);
	}
	
	void setStuData(int id, String name , char gr)
	{
		sid = id;
		sname = name;
		grade = gr;
		
	}
	
	Student(int id, String name , char gr)
	{
		sid = id;
		sname = name;
		grade = gr;
	}
	
	
}
