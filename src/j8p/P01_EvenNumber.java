package j8p;

import java.util.Arrays;
import java.util.List;

public class P01_EvenNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 2, 3, 15, 86, 13);
		list.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
	}

}
