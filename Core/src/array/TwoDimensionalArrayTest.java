package array;

public class TwoDimensionalArrayTest {

	public static void main(String[] args) 
	{
		
		int[][] d = new int[2][5];
		
		d[0] = new int[4];
		d[0][0]=10;
		d[0][1]=20;
		d[0][2]=30;
		d[0][3]=40;
		
		
		/*
		 * d[1][0]=0; d[1][1]=0;
		 */
		
		
		System.out.println(" length of d : " + d.length);
		
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}

		
		
	}

}
