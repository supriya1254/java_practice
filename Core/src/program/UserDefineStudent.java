package program;

public class UserDefineStudent implements Comparable<UserDefineStudent> {

	String name;
	int grade;
	int rollno;

	public UserDefineStudent(String n, int g, int r) {
		this.name = n;
		this.grade = g;
		this.rollno = r;
	}

	@Override
	public int compareTo(UserDefineStudent object) {
		if (grade == object.grade) {
			return 0;
		} else if (grade > object.grade) {
			return 1;
		} else
			return -1;
	}

}
