package core;


interface Test
{
	void show();
	
	//static method have body inside the interface
	static void display()
	{
		System.out.println("int display method!!");
	}
	
	//default method have body inside the interface
	static void play()
	{
		System.out.println("in play method!!");
	}
	

}


public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
