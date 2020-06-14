package program;

import java.util.HashMap;
import java.util.Map;

public class HashcodeAndEqualsTest {

	public static void main(String[] args) 
	{

		Employee empl = new Employee("ankita",1);
		Employee empl1 = new Employee("ankita",1);
		
		
		System.out.println(" without override equals method : " + empl.equals(empl1));
		
		
		  Map<Employee,Integer> map = new HashMap<Employee,Integer>();
		  map.put(empl, 1);
		  map.put(empl1, 8881);
		  
		  System.out.println(map.entrySet());
		  
		  System.out.println(map.size());
		 
		
		
	}

}
