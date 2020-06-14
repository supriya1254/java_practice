package core;

class Outer
{
	
	int i;
	
   private static class Inner
	{
		public void demo()
		{
			int i=10;
			System.out.println(" print i : "+ i);
		}
	}
}




public class NestedClassTest {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		
		Outer obj = new Outer();
		 
				
		/*
		 * Outer.Inner inn = new Outer.Inner(); inn.demo();
		 */

	}

}
