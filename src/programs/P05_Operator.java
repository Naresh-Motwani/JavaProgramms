package programs;

import java.util.Random;
import java.util.Scanner;

//WAP to perform some operator task.
public class P05_Operator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Enter the number between 1 to 10");
		int num1 = scanner.nextInt();
		int num2 = random.nextInt(10);

		System.out.println("Addition -> " + num1 + " + " + num2 + " = " + (num1 + num2));
		num1++;
		System.out.println("Addition -> " + num1 + " + " + num2 + " = " + (num1 + num2));
		num1--;
		System.out.println("Subtration -> " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("Multiple -> " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("Division -> " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println("Reminder -> " + num1 + " % " + num2 + " = " + (num1 % num2));

	}

}
