package programs;

//WAP to check if else condition
import java.util.Scanner;

public class P03_Condition {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println("Number is even " + num);
		} else {
			System.out.println("Number is odd " + num);
		}
	}

}
