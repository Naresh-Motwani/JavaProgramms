package Basic;

import java.util.Scanner;

public class P06_Multiplication_Table {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to print table");
		int num = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " Multiple by " + i + " = " + (num * i));
		}
	}

}
