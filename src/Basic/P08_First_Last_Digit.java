
package Basic;

import java.util.Scanner;

public class P08_First_Last_Digit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to know First and Last Digit ");
		int number = scanner.nextInt();
		int lastDigit, firstDigit = 0;

		lastDigit = number % 10;

		while (number != 0) {
			firstDigit = number % 10;
			number = number / 10;
		}
		System.out.println("First digit of number is " + firstDigit);
		System.out.println("Last digit of number is " + lastDigit);

		System.out.println("Sum of First and Last Digit is => " + (firstDigit + lastDigit));
	}
}