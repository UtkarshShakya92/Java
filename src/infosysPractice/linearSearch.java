package infosysPractice;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {34,45,2,67,33,69,55};
		
		int se = 100;
		
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]==se)
			{
				System.out.println("the element found at :"+ i);
				
				flag = true;
				break;
				
			}
		}
		
		if(flag == false)
		{
			System.out.println("Element not found");
		}
	}

}
