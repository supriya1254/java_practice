package java8Features;

interface TestStaticMethod
{
	static void food()
	{
		System.out.println("eating food!!");
	}
}





public class StaticMethodInInterface implements TestStaticMethod{

	public static void main(String[] args) 
	{
		TestStaticMethod.food();

	}

}
