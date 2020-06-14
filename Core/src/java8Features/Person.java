package java8Features;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

public class Person {
	

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
		return 0;
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }    

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

	public static List<Person> createRoster() {
		// TODO Auto-generated method stub
		return null;
	}

}
