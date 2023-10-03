package expriment;

public class reverseString {

	public static void main(String[] args) {

		String aString = "MaDam";
		int l = aString.length() - 1;
		System.out.println("Before the String ==>>" + aString);
		char b[] = aString.toCharArray();

		System.out.print("After the String ==>>");
		for (int i = l; i >= 0; i--) {
			System.out.print(b[i]);

		}
		System.out.println();
		String bString = String.valueOf(b);

		if (aString.equals(bString)) {
			System.out.println("Palimdrom");
		} else {
			System.out.println("Not palindrom ");
		}

	}

}
