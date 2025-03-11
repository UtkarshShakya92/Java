package Practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,3,4,5,6,6,5,3,7,4,8,8,8,8,4};
		
		int count =0;
		
		for(int i=0;i<a.length;i++)
		{
			count =1;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					count++;
					a[j]=0;
				}
			}
			
			if(count>1 && a[i]!=0)
			{
				System.out.println(a[i] + "count by  "+ count);
			}
		}
	}
}
