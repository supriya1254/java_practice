package core;

public class FinalTest 
{
	public final void work()
	{
		System.out.println("inside the final block!!");
	}
	
	static class SubFinal extends FinalTest
	{
		
		public void hello() 
		{
			super.work();
			System.out.println("inside the final sub block!!");
			
		}
	}
	
	public static void main(String[] args) 
	{
		SubFinal sf = new SubFinal();
		sf.hello();
		
		
	}

}
