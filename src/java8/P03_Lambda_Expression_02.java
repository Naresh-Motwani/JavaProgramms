package java8;

import java.util.Scanner;

@FunctionalInterface
interface Sum {

	void add(int a, int b);
}

public class P03_Lambda_Expression_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number 1 :->");
		int c = scanner.nextInt();
		System.out.print("Enter the number 2 :->");
		int d = scanner.nextInt();

		Sum sum = (a, b) -> System.out.println("Sum :-> " + (c + d));

		sum.add(c, d);
	}

}
