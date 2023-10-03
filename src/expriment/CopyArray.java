package expriment;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		int[] copy = new int[numbers.length];

		System.arraycopy(numbers, 2, copy, 0, 3);

		for (int a : copy) {
			System.out.println(a + " ");
		}
		System.out.println("=================");

		String[] copyFrom = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso",
				"Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto" };
		String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 5);
		for (String a : copyTo) {
			System.out.println(a + " ");
		}
		System.out.println("+++++++++++++++++++++++");
		// Java 8
		Arrays.stream(copyTo).map(c -> c + " ").forEach(System.out::println);

		String str = Arrays.toString(numbers);

		System.out.println("String is  " + str);

	}

}
