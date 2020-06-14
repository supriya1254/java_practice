package core;

public class MethodTest {
	
	//method overloading
	
	
	public static void display(String car)
	{
		System.out.println("Car : : : " + car);
	}

	
	public static void display(int carNum)
	{
		System.out.println("Car Number: : : " + carNum);
	}
	
	
	
	
	public static void main(String[] args) 
	{
	
		display("Blue Car");
		display(12);

	}

}
