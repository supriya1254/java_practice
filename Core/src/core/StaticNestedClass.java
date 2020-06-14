package core;

import core.FirstLevel.SecondLevel;
import core.FirstLevel.ThirdLevel;

class FirstLevel
{
	int i=10;
	static int a=20;
	
	
	
	public void first()
	{
		System.out.println("in first!!");
	}
	
	class SecondLevel
	{
		public void demo()
		{
			System.out.println("In non-static class : : " + i + " and " +  a);
			first(); //directly access the method of enclosing class
		}
		
	}
	
	static class ThirdLevel
	{
		public void display()
		{
			System.out.println("In static class : : " + a);
			FirstLevel f = new FirstLevel();
			f.first();//need reference to access the method of enclosing class
		}
		
	}

}

public class StaticNestedClass {
	
	/*
	 * static int i=10;
	 * 
	 * public static void display() { System.out.println("hello" + i); }
	 * 
	 * static { System.out.println("in static block!!"); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * display(); i=11; System.out.println(i);
		 */
		FirstLevel fl = new FirstLevel();
		
		SecondLevel sl = fl.new SecondLevel();
		sl.demo();
		
		ThirdLevel tl = new ThirdLevel();
		tl.display();

	}

}
