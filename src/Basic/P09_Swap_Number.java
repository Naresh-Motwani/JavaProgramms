package Basic;

import java.util.Scanner;

public class P09_Swap_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number1 ");
		int number = scanner.nextInt();
		System.out.println("Enter the number2 ");
		int number1 = scanner.nextInt();
		int temp;
		System.out.println("Before number1 " + number + " number2" + number1);

		temp = number;
		number = number1;
		number1 = temp;
		
		System.out.println("After number1 " + number + " number2" + number1);
		
	

	}

}
