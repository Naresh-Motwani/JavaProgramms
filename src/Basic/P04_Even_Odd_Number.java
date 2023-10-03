package Basic;

import java.util.Scanner;

public class P04_Even_Odd_Number {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int number = scanner.nextInt();
		int evenSum = 0, oddSum = 0;

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 0) {
				System.out.println("Even number is " + i);
				evenSum += i;
			} else {
				System.out.println("Odd number is " + i);
				oddSum += i;
			}
		}
		System.out.println("Even Sum of number is =>" + evenSum + "\nOdd Sum of number is =>" + oddSum);

	}

}
