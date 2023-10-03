package programs;

import java.util.Scanner;

//WAP to print pyramid pattern
public class P13_Star01 {

	public static void pyramidPattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Digit ");
		int row = scanner.nextInt();
		pyramidPattern(row);

	}
}