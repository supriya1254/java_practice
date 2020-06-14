package program;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IterateTreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "mango");
		map.put(2, "apple");
		map.put(3, "grape");
		map.put(4, "banana");
		map.put(5, "orange");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		/*Set s= map.entrySet();
		
		Iterator<Integer> it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(it.next());
		}*/
	}

}
