package program;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(101);
		arrayList.add(102);
		arrayList.add(103);
		arrayList.add(104);
		arrayList.add(105);
		
		Collections.reverse(arrayList);
		System.out.println(arrayList);
	
	}

}
