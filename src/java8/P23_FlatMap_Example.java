package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P23_FlatMap_Example {

	public static void main(String[] args) {

		List<List<String>> l1 = Arrays.asList(Arrays.asList("B"), Arrays.asList("C"), Arrays.asList("A"),
				Arrays.asList("AA"));

		List<String> sorted = l1.stream().flatMap((t) -> t.stream()).sorted((a, b) -> a.compareTo(b))
				.collect(Collectors.toList());

		System.out.println(sorted.toString());

		List<String> filter = l1.stream().flatMap((t) -> t.stream()).filter(t -> t.startsWith("A"))
				.collect(Collectors.toList());

		System.out.println(filter);

	}

}
