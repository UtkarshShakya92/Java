package infoPractice;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2,4,7,8,4,0,3,2,8,2,3,8,1,13};
		
		int count =0;
		
		for(int i =0;i<a.length;i++)
		{
			count =1;//if any repeats more than 2 times 
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			
			if(count>=1 && a[i]!=0 )
			{
				System.out.println(a[i]+" : counts :"+count);
			}
		}
		
	}

}
