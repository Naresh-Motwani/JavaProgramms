package java8;

import java.util.List;
import java.util.stream.Collectors;

public class P01FP_Structured {

	public static void main(String[] args) {

		printAllTheListOfNumber(List.of(5, 6, 4, 8, 6, 2, 9));

	}

	private static void printAllTheListOfNumber(List<Integer> numbers) {

		List<Integer> list = numbers.stream().sorted().collect(Collectors.toList());

		for (int number : list) {
			System.out.println("Numbers->" + number);

		}
	}

}
