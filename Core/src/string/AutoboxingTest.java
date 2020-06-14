package string;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingTest {
	
	public static void main(String[] args) 
	{
		//autoboxing int --> Integer : valueOf() method will use.
		
		int i =12;
		Integer intt = new Integer(1);
		Integer li = Integer.valueOf(i);
		Integer j = i;
		
		
		
		//unboxing Integer --> int : intValue() method will use. sumEven(li);
		Integer intn = new Integer(11);
		int va = intn.intValue();
		System.out.println(va);
		
	}
	
	//unboxing Integer --> int : intValue() method will use. sumEven(li);
}
