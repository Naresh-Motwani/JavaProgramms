package j8p;

import java.util.Arrays;
import java.util.List;

public class P04_FirstNumber_AndCount {

	private static long count;

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 1, 13, 14, 15, 18, 20);
		System.out.print("First Number in list ");
		list.stream().findFirst().ifPresent(System.out::println);

		// Count the Number of elements in list

		count = list.stream().count();

		System.out.println("Number of element in list " + count);

	}

}
