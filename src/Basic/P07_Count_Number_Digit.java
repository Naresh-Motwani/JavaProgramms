package Basic;

import java.util.Scanner;

public class P07_Count_Number_Digit {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to count the digit in it");
		int number = scanner.nextInt();
		int count = 0;

		while (number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Number of digit in number => " + count);

	}

}
