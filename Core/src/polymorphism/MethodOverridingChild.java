package polymorphism;

class FirstClass {

	public void first() {
		System.out.println("first class method call!!");
	}

}

class SecondClass extends FirstClass{
	
	public void first() {
		System.out.println("first class has called through the second class method call!!");
	}
	
	public void second() {
		System.out.println("second class method call!!");
	}

}

public class MethodOverridingChild {

	public static void main(String[] args) 
	{

		FirstClass fcOrigin = new FirstClass();
		fcOrigin.first();
		
		
		FirstClass fc = new SecondClass();
		fc.first();
		
		SecondClass sc = new SecondClass();
		sc.first();
		sc.second();

	}

}
