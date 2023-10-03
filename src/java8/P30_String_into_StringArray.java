package java8;

import java.util.Arrays;

public class P30_String_into_StringArray {

	public static void main(String[] args) {

		String string = "I have to go outside office due to some work";

		String[] array = Arrays.stream(string.split("\\s+")).map(String::toLowerCase).toArray(String[]::new);

		for (String a : array) {
			System.out.print(a + " ");
		}

		String number = "1 2 3 4 5 6 7 8 9";

		Integer[] array2 = Arrays.stream(number.split("\\s+")).map(Integer::valueOf).toArray(Integer[]::new);

		System.out.println();

		for (Integer a : array2) {
			System.out.print(a + " ");
		}

	}
}