package Arrays;

public class EvenOdd2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {2,43,56,23,89,76,45,34};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("EvenNumber is :"+a[i]);
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 !=0)
			{
				System.out.println("odd number is :"+a[i]);
			}
		}

	}

}
