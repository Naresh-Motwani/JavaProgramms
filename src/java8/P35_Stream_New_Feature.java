package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P35_Stream_New_Feature {

	public static void main(String[] args) {

		Stream.iterate(2, i -> i <= 10, i -> i * 2).forEach(System.out::println);

		List<Integer> list = Stream.of(1, 2, 3, 4, 5).takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(list);

		List<Integer> list1 = Stream.of(2, 3, 4, 5).takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(list1);

		List<Integer> list2 = Stream.of(2, 3, 4, 5).dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(list2);
	}

}
