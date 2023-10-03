package j8p;

import java.util.Arrays;
import java.util.List;

public class P02_NumberStartWithTwo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 10, 21, 26, 28, 31, 211);

		list.stream().map(a -> a + " ").filter(a -> a.startsWith("2")).forEach(System.out::println);
	}

}
