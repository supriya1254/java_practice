package core;

class LocalOut
{
	
		class LocalTest
		{
			int num = 5;
			//local class inside the method
			public void country()
			{
				class InsideAMethod
				{
					public void inMethod()
					{
						System.out.println("local class inside the method body!!");
					}	
				}
				
				InsideAMethod inside = new InsideAMethod();
				inside.inMethod();
		
		//local class inside a for loop
			  for(int i = 1;i<2;i++) 
			  {
			  
			  class InsideTheForLoop 
			  {
				  public void test() 
				  {
					  System.out.println("local class inside the for loop!! "); 
				  }
			  }
			  InsideTheForLoop iloop = new InsideTheForLoop();
			  iloop.test();
			  }
			  
			  //local class inside the if clause
			  if(num>2)
			  {
				  class InsideIf
				  {
					  public void insideIfClause()
					  {
						  System.out.println("local class inside the if clause :  " + num);
					  }
				  }
				  InsideIf ifobj = new InsideIf();
				  ifobj.insideIfClause();
			  }
			 
			}
		}	

}

public class LocalClassesTest {

	public static void main(String[] args) {

		LocalOut out = new LocalOut();
		
		LocalOut.LocalTest lc = out.new LocalTest();
		lc.country();
		
		

	}

}
