
package program;

import java.util.ArrayList;
import java.util.Collections;

public class SortListByComparatorMain {
	public static void main(String[] args) {

		ArrayList<Student> arrayList = new ArrayList<Student>();

		arrayList.add(new Student("Supriya", 50, 101));
		arrayList.add(new Student("Aweta", 20, 102));
		arrayList.add(new Student("Surbhi", 30, 103));

		//Collections.sort(arrayList,new SortByName());
		Collections.sort(arrayList,new SortByGrade());

		for (Student ulist : arrayList) {
			System.out.println(" name : " + ulist.name + " grade : " + ulist.grade + " rollno : " + ulist.rollno);
		}

	}

}
