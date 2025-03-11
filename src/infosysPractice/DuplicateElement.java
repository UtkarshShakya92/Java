package infosysPractice;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,4,5,6,3,8,6,4,3,8,4,6,3,2,4,9};
		
		int count = 0;
		
		for(int i=0; i<a.length;i++)
		{
			count =1;
			
			for(int j= i+1; j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					count++;
					
					a[j] =0;
				}
			}
			
			if(count >=1 && a[i]!=0)
			{
				System.out.println(a[i]+" repeated :"+ count );
			}
		}
		
	}

}
