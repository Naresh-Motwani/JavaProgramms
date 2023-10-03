package programs;

import java.util.Scanner;

public class P17_Star05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		pyramidpattern(n);
		scanner.close();
	}

	private static void pyramidpattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i;j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
