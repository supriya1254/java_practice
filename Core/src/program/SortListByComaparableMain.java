
package program;

import java.util.ArrayList;
import java.util.Collections;

public class SortListByComaparableMain {
	public static void main(String[] args) {

		ArrayList<UserDefineStudent> arrayList = new ArrayList<UserDefineStudent>();

		arrayList.add(new UserDefineStudent("Supriya", 50, 101));
		arrayList.add(new UserDefineStudent("Sweta", 20, 102));
		arrayList.add(new UserDefineStudent("Surbhi", 30, 103));

		Collections.sort(arrayList);

		for (UserDefineStudent ulist : arrayList) {
			System.out.println(" name : " + ulist.name + " grade : " + ulist.grade + " rollno : " + ulist.rollno);
		}

	}

}
