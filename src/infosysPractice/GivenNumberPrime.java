package infosysPractice;

public class GivenNumberPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int a = 6;
	 
	 if(a>1)
	 {
		 boolean flag = true;
		 
		 for(int i=2;i<a;i++)
		 {
			 if(a%i == 0)
			 {
				 flag = false;
				 break;
			 }
		 }
		 
		 if(flag == true)
		 {
			 System.out.println(a+" :the number is Prime number ");
		 }
		 
		 else
		 {
			 System.out.println(a+" :the number is not a Prime number ");
		 }
	 }
	 else
	 {
		 System.out.println("Enter number greater than 1 ");
	 }
	
	}

}
