package Practice;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,30,15,12,40,20,60};
		
		int se = 20;
		
		boolean flag = false;
		
		for(int i=0;i<a.length;i++)
	    {
			if(se == a[i])
			{
				System.out.println("The required number is present on index  "+i);
				flag = true;
				break;
			}
			
			
	    }
		
		if(flag ==false)
		{
			System.out.println(se + "   The number is nnot present on array");
		}

	}

}
