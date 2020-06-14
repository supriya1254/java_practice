package core;

import core.Phone.SmartPhone;

class Phone
{
	public static void show()
	{
		System.out.println("In show.");
	}
	
	//static inner class
	static class SmartPhone
	{
		public void display()
		{
			System.out.println("In display.");
		}
	}
}	
	

public class StaticInnerClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Phone.show();
		
		//Test static class
		SmartPhone sp = new SmartPhone();
		sp.display();
		
		

	}

}
