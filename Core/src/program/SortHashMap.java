package program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		map.put(101, "Supriya");
		map.put(102, "Surbhi");
		map.put(107, "Surbhi");
		map.put(105, "Surbhi");
		map.put(103, "Sweta");
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			
			Map.Entry entry = (Map.Entry) itr.next();
			
			System.out.println("key" + entry.getKey());
			
		}
		

	}

}
