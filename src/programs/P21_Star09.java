package programs;

import java.util.Scanner;

public class P21_Star09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = scanner.nextInt();
		pyramidPattern(n);
		scanner.close();
	}

	private static void pyramidPattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (i * 2) - 1; j++) {

				if (j == 1 || j == (i * 2 - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

		for (int i = n-1; i >= 1; i--) {
			for (int j = 1; j <= (i * 2) - 1; j++) {
				if (j == 1 || j == (i * 2) - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}
}
