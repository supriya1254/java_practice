package inheritance;

/*A nested class has access to all the private members of 
 * its enclosing class—both fields and methods. 
 * Therefore, a public or protected nested class inherited by 
 * a subclass has indirect access to all of the private members of the superclass.*/

//TODO

class DemoOut {

	DemoOut() {
	}

	int i;

	public DemoOut(int i) {
		this.i = i;
	}

	public void display() {
		System.out.println("Inside Super class");
	}

}

public class SuperClassTest extends DemoOut {

	public SuperClassTest(int i) {
		super.i = i;

	}

	public void display() {
		super.display();
		System.out.println("Inside Sub class" + i);
	}

	public static void main(String[] args) {
		SuperClassTest sc = new SuperClassTest(10);
		 sc.display(); 
	}

}
