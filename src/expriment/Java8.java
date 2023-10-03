package expriment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(
				Arrays.asList(2, 300, 1, 4, 2, 5, 3, 6, 4, 7, 8, 9, 11, 19, 17, 111, 100));

		numbers.stream().filter((n) -> n % 2 == 0).forEach(System.out::println);

		
		// converting List of Integer into Array of Integer
		int[] array = numbers.stream().mapToInt(Integer::intValue).toArray();
		// Now converting Array of Integer into Array of String
		String[] strings = Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new);
		// Find the element in Array of String which start with "1"
		List<String> collect = Arrays.stream(strings).filter((s) -> s.startsWith("1")).collect(Collectors.toList());
		// printing the List of String
		System.out.println(collect);
		// Converting List of String into List of Integer
		List<Integer> numberList = collect.stream().map(c -> Integer.parseInt(c)).collect(Collectors.toList());
		System.out.println(numberList);

		// Find the element which start with 1 into List of Integer
		List<String> list = numbers.stream().map((n) -> n + "").filter((n) -> n.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(list);

		// Find the duplicate element in List of Integer
		Set<Integer> set = new HashSet<>();
		numbers.stream().filter((n) -> !set.add(n)).forEach((s) -> System.out.print(s + " "));

		// find the first elemnt in List of Integer
		System.out.println();
		System.out.println("First Element in List ");
		numbers.stream().findFirst().ifPresent(System.out::println);

		// Count the number of element in present list

		long count = numbers.stream().count();
		System.out.println("Number of element " + count);

		// Max and Min element in List

		Integer maxInteger = numbers.stream().max(Integer::compare).get();
		Integer minInteger = numbers.stream().min(Integer::compare).get();

		System.out.println("Max No: is " + maxInteger + " and Min No: is " + minInteger);

		// Sort the value of given list
		List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		// Reverse order sort
		List<Integer> reverseSortedList = numbers.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverseSortedList);

	}

}
