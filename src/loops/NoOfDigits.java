package loops;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123456897;
		int count =0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		 
		System.out.println("Number of digits are :"+ count);
	}

}
