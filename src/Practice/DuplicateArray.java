package Practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      bruteForce();
      SetUse();
		
	}

	public static int[] bruteForce()
	{
         int a []= {10,20,30,40,20,50,60,30};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j =i+1;j<a.length;j++)
			{ 
				if((a[i]==a[j]) && (i!=j))
				{
					System.out.println(a[j]);
				}
			}
		}
		
		return a; 
		
	}
	
	public static int[] SetUse()
	{
		int[] a= {10,20,30,40,20,50,60,30,30};
		
		System.out.println("By using SetUse");
		
		Set<Integer> s = new HashSet<>();
		
		for(int no: a)
		{
			boolean b = s.add(no);
			
			if(b == false)
			{
				System.out.println(no);
			}
		}
		return a;
	}
}
