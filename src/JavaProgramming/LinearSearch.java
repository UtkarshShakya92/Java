package JavaProgramming;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,40,50,60,70,80,90};
		
		int se = 50;
		
		boolean flag = false;
		
		for(int i=0;i<a.length;i++)
		{
			if(se == a[i])
			{
				flag = true;
				System.out.println("The element is present on array index "+ i);
				break;
			}
			
			else
			{
				System.out.println("The element is not present on array");
				break;
			}
			
			/*else if(se != a[i])
			{
				flag = false;
				System.out.println("The element is not present on array");
				break;
			}*/
			
		}
			
		
	}

}
