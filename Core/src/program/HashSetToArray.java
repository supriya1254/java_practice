package program;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetToArray {

	public static void main(String[] args) 
	{
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(100);
		hash.add(200);
		hash.add(300);
		hash.add(400);
		hash.add(500);
		
		Integer arr[] = new Integer[hash.size()];
		
		hash.toArray(arr);
	
		
		for(Integer it : hash) 
		{
			System.out.println(it); 
		}
		 
		
	}

}
