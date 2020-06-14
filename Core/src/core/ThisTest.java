package core;

public class ThisTest {
	
	int i=1, j=2;
	
	
	public ThisTest(int i, int j)
	{
		//this.i=i;
		//this.j=j;
		System.out.println(" i :" + i + " and  " + " j : " + j);
		System.out.println(" this.i :" + this.i + " and  " + " this.j : " + this.j);
	}

	public static void main(String[] args) 
	{

		ThisTest t = new ThisTest(10,20);
		//System.out.println(" p= : " + t.i + " and " + " q= "+ t.j);
	}

}
