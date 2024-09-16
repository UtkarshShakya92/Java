package Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,10,40,10,50};
		
		int num = 10;
		int count=0;
		
		for(int value:a)
		{
			if(value == num)
			{
			count++;
			}
		}
		
		System.out.println("The number is repeated :"+count);
	}

}
