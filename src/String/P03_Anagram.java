package String;

import java.util.Arrays;

public class P03_Anagram {

	public static void main(String[] args) {

		String str = "madam";
		String rts = "madam";

		str = str.toLowerCase();
		rts = rts.toLowerCase();

		if (str.length() != rts.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			char[] chStr = str.toCharArray();
			char[] chRts = rts.toCharArray();

			Arrays.sort(chStr);
			Arrays.sort(chRts);

			if (Arrays.equals(chStr, chRts) == true) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}
	}
}