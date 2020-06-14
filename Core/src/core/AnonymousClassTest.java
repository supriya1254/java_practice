package core;

interface NestedClasswithInterface 
{
		public void show();
		
}

public class AnonymousClassTest {

	public static void main(String[] args) 
	{
		//Anonymous class Test 
		NestedClasswithInterface obj = new NestedClasswithInterface() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("In display");
				
			}
		};
		obj.show();
	}

	
}
