package java8;

import java.util.Arrays;
import java.util.List;

public class P22_ExceptionHandling_Java8 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("10", "20", "30", "xyz");

		/*
		 * List<Integer> num =
		 * list.stream().map(Integer::parseInt).collect(Collectors.toList());
		 * System.out.println(num);
		 */

		// list.forEach((t) -> System.out.println(Integer.parseInt(t)));

		list.forEach((t) -> {

			try {
				System.out.println(Integer.parseInt(t));
			} catch (Exception e) {
				System.out.println(e.toString());
				System.out.println(e.getMessage());

			}
		});

	}

}
