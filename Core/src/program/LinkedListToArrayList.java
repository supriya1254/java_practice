package program;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.naming.LinkLoopException;

public class LinkedListToArrayList {

	public static void main(String[] args)
	{
		LinkedList <Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(101);
		linkedList.add(102);
		linkedList.add(103);
		linkedList.add(104);
		linkedList.add(105);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(linkedList);
		
		for(Integer array : arrayList)
		{
			System.out.println(array);
		}
		

	}

}
