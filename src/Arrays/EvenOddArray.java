package Arrays;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6};
		
		/*
		//Even values 
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even values:"+a[i]);
			}
			
		}
		
		/*else    
			{
				System.out.println("odd values:"+a[i]);
			}*/ //--using this the even and odd vlues are coming selerially 
			
			//Odd values
			
		/*
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2 !=0)
				{
					System.out.println("Odd values:"+a[j]);
				}
			}
			
			*/
		
		///-----Enhanced for loop
		
		for(int value :a)
		{
			if(value%2==0)
			{
				System.out.println("Even values:"+ value);
			}
				
		}
			
		for(int value :a)
		{
			if(value%2!=0)
			{
				System.out.println("Odd values:"+ value);
			}
				
		}
	}

}
