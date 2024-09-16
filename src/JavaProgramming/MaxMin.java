package JavaProgramming;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a []= {40,20,30,50,60,10,35,70};
		
		int max = a[0];
		int min = a[0];
		
		for(int i =1; i<a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		
		System.out.println("Max value is :" + max);
		
		for(int i=1;i<a.length;i++)
		{
			if (min >a[i])
			{
				min = a[i];
			}
		}
		System.out.println("Min value is :"+ min) ;
	}

}
