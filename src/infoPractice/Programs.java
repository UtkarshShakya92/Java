package infoPractice;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,5,7,3,4,6,7,9,2,8,3};
		
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			count =1;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			
			if(count>1 && a[i]!=0)
			{
				System.out.println(a[i]+"count: "+count);
			}
			
		}
	}

}
