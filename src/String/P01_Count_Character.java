package String;

import java.util.Scanner;

public class P01_Count_Character {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String for Count.");

		String str = scanner.nextLine();
		int count = 0, space = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			} else {
				space++;
			}
		}
		System.out.println("Count is " + count + " Space is " + space);
	}
}