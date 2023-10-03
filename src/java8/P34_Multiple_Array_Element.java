package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class P34_Multiple_Array_Element {

	public static void main(String[] args) {

		Integer[] number = {};
		List<Integer> list = Arrays.asList(number);

		Optional<Integer> reduce = list.stream().reduce((a, b) -> a * b);

		if (reduce.isPresent()) {
			System.out.println("Arraya multiple =>" + reduce.get());
		} else {
			System.out.println("Empty Array");
		}

	}

}
