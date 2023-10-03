package String;

public class P09_StringRotation {

	public static void main(String[] args) {

		String str = "ABCDE";
		String str1 = "EDCBA";

		if (str.length() != str1.length()) {
			System.out.println("Second string is not a rotation of first string");
		} else {
			str = str.concat(str);

			if (str.indexOf(str1) != -1) {
				System.out.println("Second string is not a rotation of first string");
			} else {
				System.out.println("Second string is rotation of first string");
			}

		}

	}

}
