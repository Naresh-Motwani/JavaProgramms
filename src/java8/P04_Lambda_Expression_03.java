package java8;

import java.util.Scanner;

@FunctionalInterface
interface Multiple {
	int multi(int a, int b);
}

public class P04_Lambda_Expression_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number 1 :->");
		int c = scanner.nextInt();
		System.out.print("Enter the number 2 :->");
		int d = scanner.nextInt();

		/*
		 * Multiple multiple = (a, b) -> { return (c * d); };
		 */

		Multiple multiple = (a, b) -> (a * b);

		System.out.println("Multiple :-> " + multiple.multi(c, d));
	}

}
