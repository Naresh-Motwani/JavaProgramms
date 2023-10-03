package String;

public class P06_Change_Case {

	public static void main(String[] args) {

		String name = "My Name Is Naresh Motwani";

		StringBuffer nString = new StringBuffer(name);
		System.out.println(nString);

		for (int i = 0; i < name.length(); i++) {

			if (Character.isLowerCase(name.charAt(i))) {
				nString.setCharAt(i, Character.toUpperCase(name.charAt(i)));
			} else {
				nString.setCharAt(i, Character.toLowerCase(name.charAt(i)));
			}
		}
		System.out.println(nString);
	}

}
