package core;

class OuterClass
{
	public void show()
	{
		System.out.println("In show.");
	}
	
	//member inner class
	class InnerClass
	{
		public void display()
		{
			System.out.println("In display.");
		}
	}
}	
	

public class MemberInnerClass 
{

	public static void main(String[] args) 
	{
		OuterClass outObj = new OuterClass();
		outObj.show();
		
		//Test member class
		
		OuterClass.InnerClass inn = outObj.new InnerClass();
		inn.display();
		
		

	}

}
