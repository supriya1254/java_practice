package array;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		
		int i[]=  {11,44,15,19};
		int i1[]= {1,4,1,5};
		int i2[]= {13,74,12,50};
		int i3[]= {16,9,1,59};
		
		int d[][]= {i,i1,i2,i3};
		
		for(int j=0;j<d.length;j++)
		{
			for(int k=0;k<d.length;k++)
			{
				System.out.print(" " + d[j][k]);
			}
			System.out.println();
		}

		
		
	}

}
