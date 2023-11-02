package Java12;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		System.out.println("Enter the Game Name ");
		Scanner sc = new Scanner(System.in);
		String game = sc.nextLine().toUpperCase();

		System.out.println("The Game Number is " + getGameNumber(game));

	}

	private static int getGameNumber(String game) {

		int gamenumber = switch (game) {
		case "CRICKET" -> 1;
		case "BATMINTON", "FOOTBALL" -> 2;
		default -> throw new IllegalArgumentException("Unexpected value: " + game);
		};

		return gamenumber;
	}

}
