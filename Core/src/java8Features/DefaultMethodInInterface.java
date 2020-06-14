package java8Features;

interface TestDefaultMethod
{
	void cook();
	default void food()
	{
		System.out.println("eating food!!");
	}

}

interface TestChild extends TestDefaultMethod
{
	
	

}

class childImp implements TestChild
{

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}
}


class TestImp implements TestDefaultMethod
{
	public void cook()
	{
		System.out.println("cooking!!");
	}

}

public class DefaultMethodInInterface {

	public static void main(String[] args) 
	{
		
		TestDefaultMethod test = new TestImp();
		test.cook();
		test.food();

	}

}
