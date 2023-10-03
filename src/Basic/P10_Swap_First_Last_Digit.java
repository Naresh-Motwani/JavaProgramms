package Basic;

import java.util.Scanner;

public class P10_Swap_First_Last_Digit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();
		int lastDigit, firstDigit, digit, swapNum;

		lastDigit = number % 10;
		digit = (int) Math.log10(number);
		firstDigit = number / (int) Math.pow(10, digit);

		System.out.println("Last digit " + lastDigit + " First digit " + firstDigit + " Digits " + digit);

		swapNum = lastDigit;
		System.out.println("Swap 1 " + swapNum);

		swapNum = (int) (swapNum * Math.round(Math.pow(10, digit)));
		System.out.println("Swap 2 " + swapNum);

		swapNum = (int) (swapNum + (number % Math.round(Math.pow(10, digit))));
		System.out.println("Swap 3 " + swapNum);

		swapNum = swapNum - lastDigit;
		System.out.println("Swap 4 " + swapNum);

		swapNum = swapNum + firstDigit;
		System.out.println("Swap 5 " + swapNum);

		System.out.println("Swap final " + swapNum);

	}

}
