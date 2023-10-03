package programs;

import java.util.Scanner;

public class P18_Star06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = scanner.nextInt();
		pyramidpattern(n);
		scanner.close();
	}

	private static void pyramidpattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i ||i==n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
