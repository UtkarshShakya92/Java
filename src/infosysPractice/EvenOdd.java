package infosysPractice;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,5,2,6,1,34,33,21,22,67,88,69};
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println("even value  :"+ a[i]);
			}
			
			else if(a[i]%2 !=0)
			{
				System.out.println("Odd value :"+ a[i]);
			}
		}
	}

}
