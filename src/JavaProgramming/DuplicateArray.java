package JavaProgramming;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,10,40,50,10,60, 10};
		
		int num =10;
		
		int count=0;
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count ++;
			}
		}*/
		
		for(int value : a)
		{
			if(value == num)
			{
				count++;
			}
		}
		
		System.out.println("The nummber of times 10 is repeating "+count);
	}

}
