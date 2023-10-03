package expriment;

import java.util.Scanner;

/*Spy Number is 123 == 1+2+3=6 and 1*2*3=6 so both result is same so spy number
*/
public class P01_Spy_Number {

	public static void isSpy(int number) {
		int reminder = 0, sum = 0, mutiplel = 1;

		while (number != 0) {
			reminder = number % 10;
			sum += reminder;
			mutiplel *= reminder;
			number = number / 10;
		}
		if (sum == mutiplel) {
			System.out.println("Spy number");
		} else {
			System.out.println("Not a spy");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();
		if (number > 0) {
			P01_Spy_Number.isSpy(number);
		}

	}

}
