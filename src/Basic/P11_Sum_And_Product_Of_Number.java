package Basic;

import java.util.Scanner;

public class P11_Sum_And_Product_Of_Number {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();
		int sum = 0, reminder, product = 1, temp;
		temp = number;
		while (number != 0) {
			reminder = number % 10;
			sum += reminder;
			product *= reminder;
			number /= 10;
		}
		System.out.println("Number is " + temp + " and sum of Number is " + sum + " and product of Number is " + product);
	}

}
