package Arrays;

public class MultiDimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]a= {{2,4,6},{3,5,7},{1,2,3}};
		
		for(int r=0;r<3;r++)
		{
			for(int c =0;c<3;c++)
			{
				System.out.print(a[r][c]);
			}
		}
	}

}
