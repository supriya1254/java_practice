package program;

import java.util.Comparator;

public class SortByName  implements Comparator<Student> 
{

	@Override
	public int compare(Student obj1, Student obj2) 
	{
		return obj1.name.compareTo(obj2.name);
	}
}
