package programs;

public class P35_Method01 {

	public static void main(String[] args) {

		mySurname("Motwani");
		mySurname("Sharma");
		myBio("Naresh", "Motwani", 25);
		myBio("Rahul", "Sharma", 30);
		System.out.println(multiple(5));

	}

	private static int multiple(int n) {
		// TODO Auto-generated method stub
		return n * 5;
	}

	private static void myBio(String firstNameString, String lastNameString, int age) {
		System.out.println(lastNameString + " " + firstNameString + " " + age);
	}

	private static void mySurname(String lastNameString) {

		System.out.println("Naresh " + lastNameString);
	}

}
