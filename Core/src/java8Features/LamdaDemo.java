package java8Features;

interface Demo
{

	void display();
}

public class LamdaDemo {

	public static void main(String[] args) 
	{
		Demo d = new Demo() {
			
			@Override
			public void display() {
				System.out.println("Using Demo!!");
			}
			
		}; 
		d.display();
		
		
		//with lamda expression 
		/*
		 * Demo d = i->System.out.println("Using Demo!!" + i); d.display(10);
		 */

	}

}
