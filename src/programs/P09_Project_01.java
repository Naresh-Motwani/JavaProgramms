package programs;

//WAP to guess random number and earn point.
import java.util.Random;
import java.util.Scanner;

public class P09_Project_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Enter the number between 1 to 10 ");
		int num = scanner.nextInt();
		int count = 0;
		System.out.println("Enter the number between 1 to 6 to spein wheel");
		int swheel = scanner.nextInt();

		if (num > 10 || swheel > 6) {
			if (num > 10) {
				System.out.println("Enter the number between 1 to 10. you entered " + num);
			} else {
				System.out.println("Enter the number between 1 to 6. you entered " + swheel);
			}
		} else {
			for (int i = 1; i <= swheel; i++) {
				int rnum = random.nextInt(10);
				if (num == rnum) {
					System.out.println("Wow! your Guess number is right.Random number is " + rnum + " You won 1 point");
					count++;
				} else {
					System.out
							.println("Opps! Your Guess number is wrong.Random number is " + rnum + " You lost 1 point");
					count--;
				}

			}
		}
		System.out.println("Your final score is " + count);

	}
}
