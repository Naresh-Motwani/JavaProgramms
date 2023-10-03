package programs;

import java.util.Scanner;

public class P20_Star08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = scanner.nextInt();
		pyramidPattern(n);
		scanner.close();

	}

	private static void pyramidPattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((i * 2) - 1); j++) {

				if (j == 1 || j == ((i * 2) - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		for (int i = n; i >= 1; i--) {

			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {

				if (j == 1 || j == ((i * 2) - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println(" ");
		}
	}

}
