package String;

public class P07_Replace_Space {

	public static void main(String[] args) {

		String nameString = "My Name Is Naresh Motwani";
		char ch = '_';

		nameString = nameString.replace(' ', ch);

		System.out.println(nameString);
	}
}