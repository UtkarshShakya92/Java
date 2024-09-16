package loops;

public class EvenAndOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 23456;
		
		int even_count =0;
		int odd_count =0;
		
		while(num>0)
		{
			int rem = num%10; 
			 
			if(rem%2 ==0)
			{
				even_count++;
			}
			
			else
			{odd_count++;}
			
			num = num/10;
		}
		System.out.println(" Even number count :"+ even_count);
		
		System.out.println(" Odd number count :"+ odd_count);
	}

}
