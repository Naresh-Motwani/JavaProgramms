package String;

import java.util.Scanner;

public class P08_StringPalindromeProgram {

	private static boolean isEmpty(String input) {
		return input == null || input.length() == 0;
	}

	public static boolean checkPalindrome(String input) {

		// Check error conditions

		String reverse = "";
		int length = input.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse += input.charAt(i);
		}

		if (input.equals(reverse)) {
			System.out.println(input + " is palindrome = " + true);
		} else {
			System.out.println(input + " is not palindrome = " + false);
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to check");
		String input = scanner.next();
		checkPalindrome(input.toLowerCase());

	}
}
