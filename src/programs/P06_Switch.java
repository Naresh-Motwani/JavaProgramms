package programs;

import java.util.Scanner;

//WAP to check Switch condition.
public class P06_Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day name ");

		String dayString = scanner.next().toLowerCase();

		switch (dayString) {
		case "monday": {
			System.out.println("Hey Its Monday.");
		}
			break;
		case "tuesday": {
			System.out.println("Hey Its Tuesday.");
		}
			break;
		case "wednesday": {
			System.out.println("Hey Its Wednesday.");
		}
			break;
		case "thusday": {
			System.out.println("Hey Its Thusday.");
		}
			break;
		case "friday": {
			System.out.println("Hey Its Friday.");
		}
			break;
		case "saturday": {
			System.out.println("Hey Its Saturday.");
		}
			break;
		case "sunday": {
			System.out.println("Hey Its Sunday.");
		}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + dayString);
		}

	}

}
