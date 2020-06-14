package program;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) 
	{
		//ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(101);
		arrayList.add(102);
		arrayList.add(103);
		arrayList.add(104);
		arrayList.add(105);
		
		
		/*
		 * //Array 
		 * Integer array[] = new Integer[arrayList.size()];
		 */
		
		//Using toArray method
		Integer array[] = arrayList.toArray(new Integer[arrayList.size()]);
		
		//get all the value from arrayList and add it to array
		for(int i=0;i<arrayList.size();i++)
		{
			array[i] = arrayList.get(i);
			
			System.out.println("arrayList : " + arrayList.get(i));
		}
		
		
		for(Integer arr : array)
		{
			System.out.println("array: " + arr);
		}
		
		
		
		
	}

}
