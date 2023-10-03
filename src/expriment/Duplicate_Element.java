package expriment;

import java.util.Arrays;

public class Duplicate_Element {

	public static void main(String[] args) {

		String a[] = { "A", "B", "C", "A", "D", "B", "E" };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[j] + "  Duplicate element ");
				}
			}
		}

		String nameString = Arrays.toString(a);
		nameString = nameString + "rahul";
		System.out.println(nameString );

	}

}
