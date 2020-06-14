package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) 
	{
		List<String> li = new ArrayList();
		li.add("hello");
		String s = li.get(0);
		System.out.println(s);

	}

}
