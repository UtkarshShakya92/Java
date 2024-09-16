package loops;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}*/
		
		// print even numbers between 1 to 10
		/*Approach 1
		int i=2;
		while(i<=10)
		{
			System.out.println(i);
			i=i+2;
		}*/
             
		
		//Approach2
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
			i++;
		}
		
		//print even numbers
		
		int j=1;
		while (j<=10)
		{
			System.out.println(j);
			j=j+2;
		}
		
		int h =1;
		while(h<=10)
		{
			if(h%2!=0)
			{
			System.out.println(h);
			}
			h++;
		}
	}

}
