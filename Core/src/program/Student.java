package program;

import java.util.Comparator;

public class Student {

	String name;
	int grade;
	int rollno;

	public Student(String n, int g, int r) {
		this.name = n;
		this.grade = g;
		this.rollno = r;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public boolean equals(Student o)
	{
		if(o != null)
		{
			String nam = o.getName(); 
			
			if(name != null && nam.equals(o.getName()))
			{
				return true;
			}
		}
		return false;
		
	}

}
