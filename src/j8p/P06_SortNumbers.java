package j8p;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P06_SortNumbers {

	private static List<Integer> list;

	public static void main(String[] args) {

		list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		Set<Integer> set = new HashSet<Integer>();

		list.stream().sorted().filter(a -> set.add(a)).forEach(System.out::println);
		System.out.println("--------------Reverse Order Sorting ---------------------------");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
