package core;

public class FormatMethod {

	public static void main(String[] args) {
		float floatVar = 1000;
		int intVar = 2000;
		String stringVar = "Hello";
		/*
		 * System.out.println("hello!!" + i); System.out.format("Are you there!!"+" " +
		 * " " + i,j,k);
		 */
		
		
		System.out.format("The value of " + "the float variable is " +
			     "%f, while the value of the " + "integer variable is %d, " +
			     "and the string is %s", floatVar, intVar, stringVar);

	}

}
