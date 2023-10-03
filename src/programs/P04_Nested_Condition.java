package programs;

import java.util.Random;

//WAP to check Nested Condition.
public class P04_Nested_Condition {

	public static void main(String[] args) {

		Random random = new Random();
		int num = random.nextInt(30);

		if (num <= 10) {
			System.out.println("Number is between 0 to 10-> " + num);
		} else if (num <= 20) {
			System.out.println("Number is between 11 to 20-> " + num);
		} else {
			System.out.println("Number is greater the 20-> " + num);
		}

	}

}
