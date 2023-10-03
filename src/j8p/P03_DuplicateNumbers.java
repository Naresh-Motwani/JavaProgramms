package j8p;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P03_DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 1, 3, 4, 5, 6, 7, 7);
		Set<Integer> set = new HashSet<Integer>();

		list.stream().filter(a -> !set.add(a)).forEach(System.out::println);
	}

}
