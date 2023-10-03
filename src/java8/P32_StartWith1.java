package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P32_StartWith1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 100, 101, 200, 201, 1000);

		List<String> collect = list.stream().map(s -> s + "").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(collect);

	}

}
