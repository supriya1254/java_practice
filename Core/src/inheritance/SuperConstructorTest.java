package inheritance;

public class SuperConstructorTest 
{
	SuperConstructorTest(int i)
	{
		System.out.println("Inside Super constructor!!" + i);
	}
	
	class SubClass extends SuperConstructorTest
	{
		SubClass(int i) {
			super(i); //second time i am using this constructor.
			System.out.println("Inside Sup constructor!!" + i);
		}
	}

	public static void main(String[] args) 
	{
		SuperConstructorTest st = new SuperConstructorTest(10);
		SubClass sc = st.new SubClass(20);
	}

}
