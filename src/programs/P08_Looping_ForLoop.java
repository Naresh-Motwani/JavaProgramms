package programs;

import java.util.Scanner;

//WAP to check For loop condition(tables) 
public class P08_Looping_ForLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to table");
		int num = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
