package program;

import java.util.Comparator;

public class SortByGrade  implements Comparator<Student> 
{

	@Override
	public int compare(Student obj1, Student obj2) 
	{
		if(obj1.grade == obj2.grade)
		{
		return 0;
		}
		else if(obj1.grade>obj2.grade)
		{
			return 1;
		}
		return -1;
	}
}
