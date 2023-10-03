package programs;

import java.util.Scanner;

//WAP to print String 11 time(While loop)
public class P07_Looping_while {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word ");
		String writeString = scanner.nextLine();
		int i = 1;
		while (i <= 11) {
			System.out.println(writeString + " " + i);
			i++;
		}

	}

}
