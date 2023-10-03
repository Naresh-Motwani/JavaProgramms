package programs;

import java.util.Scanner;

//WAP to print 8 in squre way(5*5)
public class P11_Array02 {

	public static void main(String[] args) {
		System.out.println("Enter the number of Square row and coloum ");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int coloum = scanner.nextInt();
		for (int i = 0; i < coloum; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}