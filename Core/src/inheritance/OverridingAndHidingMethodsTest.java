package inheritance;


class SuperDemo
{
	void display()
	{
		System.out.println("Inside the instance method of Super class!!");
	}
	
}

class SubDemo extends SuperDemo
{
	void display()
	{
		System.out.println("Inside the instance method of Sub class!!");
	}

}





public class OverridingAndHidingMethodsTest extends SubDemo{

	public static void main(String[] args) 
	{

		OverridingAndHidingMethodsTest obj = new OverridingAndHidingMethodsTest();
		obj.display();
		
	}

}
