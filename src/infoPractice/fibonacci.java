package infoPractice;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 =0; 
		int n2 =1;
		
		int sum =0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=0;i<10;i++)
		{
			sum = n1+n2;
			System.out.print(" "+sum);
			
			n1 = n2;
			n2 = sum;
		}
	}

}
//0 1 1 2 3 5 8 13 21 34 55 89