package programs;

import java.util.Scanner;

public class P37_Recursion01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scanner.nextInt();
		int result = sum(n);
		System.out.println("Sum of " + n + " number is " + result);
	}

	private static int sum(int i) {
		if (i > 0) {
			return i + sum(i - 1);
		} else {
			return 0;
		}
	}
}
