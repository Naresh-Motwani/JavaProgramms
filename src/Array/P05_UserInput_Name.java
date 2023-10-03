package Array;

import java.util.Scanner;

public class P05_UserInput_Name {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of input ");
		int length = scan.nextInt();

		String[] names = new String[length];

		for (int i = 0; i < length; i++) {
			names[i] = scan.next();
		}

		for (int i = 0; i < length; i++) {
			System.out.println("Name of person is " + names[i]);
		}

		scan.close();

	}

}
