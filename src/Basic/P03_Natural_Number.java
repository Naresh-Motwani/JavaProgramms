package Basic;

import java.util.Scanner;

public class P03_Natural_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to print natural number till ");
		int number = scan.nextInt();
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			System.out.println("Natural Number is = " + i);
			sum += i;
		}

		for (int i = number; i >= 1; i--) {
			System.out.println("Natural Number in Reverse = " + i);
		}
		System.out.println("Sum of Natural Number is " + sum);
	}
}