package Array;

import java.util.Scanner;

public class P03_UserDefineArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int nextInt = scan.nextInt();
		int[] arr = new int[nextInt];

		for (int i = 0; i < nextInt; i++) {
			System.out.println("Enter the Element " + (i + 1));
			arr[i] = scan.nextInt();
		}
		System.out.print("Arrays is ");

		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		System.out.println("Sum of Arrays is " + sum);
		scan.close();
	}

}
