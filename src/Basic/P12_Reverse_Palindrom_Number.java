package Basic;

import java.util.Scanner;

public class P12_Reverse_Palindrom_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();

		int reverse = 0, reminder, temp;
		temp = number;

		while (number != 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reverse " + reverse);
		if (temp == reverse) {
			System.out.println("Number is Palindrom");
		} else {
			System.out.println("Number is not Palindrom");
		}

	}

}
