package java8;

import java.util.Scanner;

@FunctionalInterface
interface Subtract {
	int sub(int a, int b);
}

public class P05_Lambda_Expression_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number 1 :->");
		int c = scanner.nextInt();
		System.out.print("Enter the number 2 :->");
		int d = scanner.nextInt();

		Subtract subtract = (a, b) -> {
			if (b < a) {
				throw new RuntimeException("Wrong Input");
			} else {
				return (b - a);
			}
		};
		System.out.println(subtract.sub(c, d));
	}

}
