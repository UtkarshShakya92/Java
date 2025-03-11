package loops;

public class N7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2 4  5 
		 * 3 0  7              out put =12 required
		 * 1 12 9
		 */
		
		int [][]a= {{2,4,5},{3,0,7},{1,12,9}};
		
		int min = a[0][0];  
		int mincolvalue=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					mincolvalue =j;
					
				}
			}
		}
		
		int max = a[0][mincolvalue];
		/*int k =0;
		
		while(k<3)
		{
			if(a[k][mincolvalue]> max)
			{
				max = a[k][mincolvalue];
			}
			k++;
		}*/
		
		for(int k=0;k<3;k++)
		{
			if(a[k][mincolvalue]> max)
			{
				max = a[k][mincolvalue];
			}
		}
		
		System.out.println(max);
		 
	}
	
}

