package Arrays;

public class LinearSearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {20,10,40,60,45,89,102,34};
		
		int search_element =45;
		
		boolean flag = false;
		
		for(int i=0;i<a.length;i++)
		{
			if(search_element == a[i])
			{
				System.out.println("Element found at index : "+i);
				flag = true;
				break;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("Element Not found");
		}

	}

}
