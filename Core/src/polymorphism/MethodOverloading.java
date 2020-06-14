package polymorphism;

public class MethodOverloading {

	
	public static void shape()
	{
		System.out.println("default shape!!");
	}
	
	public static void shape(String triangle)
	{
		System.out.println(" example like  : : " + triangle);
	}
	
	public static void shape(String triangle,String circle)
	{
		System.out.println(" examples are like  : : " + triangle + " and " + circle);
	}
	
	
	public static void main(String[] args) {

		
		shape("triangle board!!", "circle board!!");
	}

}
