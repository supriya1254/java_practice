package program;

import java.util.ArrayList;
import java.util.List;

public class TraverseArrayList {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		for (Integer list : li)
		{
			System.out.println(list.intValue());
			
		}
		

	}

}
