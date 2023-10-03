package programs;

import java.util.Scanner;

public class P36_MethodOverLoading {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int a = scanner.nextInt();
		System.out.println("Enter the second number");
		int b = scanner.nextInt();
		System.out.println("Enter the decimal number");
		double c = scanner.nextDouble();
		System.out.println("Enter the second decimal number");
		double d = scanner.nextDouble();

		int num = plus(a, b);
		double dnum = plus(c, d);
		System.out.println("Interger : " + num);
		System.out.println("Double : " + dnum);
	}

	private static double plus(double d, double e) {
		return (d + e);
	}

	private static int plus(int i, int j) {
		return (i + j);
	}

}
