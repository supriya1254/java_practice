package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckElementPresentInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		for(int i=0;i<li.size();i++)
		{
			
			if(li.contains(2))
			{
				count ++;
			}
			
		}
		if(count>0)
		{
			System.out.println("element is present in this list");
		}
		else
		{
			System.out.println("element is not present in this list");
		}
	}

}
