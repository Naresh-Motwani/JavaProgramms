package Basic;

import java.util.Scanner;

public class P02_Arthmatic_Operation {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1 = scan.nextInt();
		System.out.println("Enter the number 2");
		int num2 = scan.nextInt();

		add(num1, num2);
		sub(num1, num2);
		//multi(num1, num2);
		// div(num1, num2);

	}

	private static void sub(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("Subtraction ==>" + (num1 - num2));
		} else {
			System.out.println("Subtraction ==>" + (num1 - num2));
		}
	}

	private static void add(int num1, int num2) {
		System.out.println("Addition==>" + (num1 + num2));
	}

}
