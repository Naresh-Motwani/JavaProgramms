package expriment;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8_String {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String as input ");
		String string = scanner.next();

		// Find the first non repeated character in it using java 8
		LinkedHashMap<Character, Long> collect = string.chars()
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Character character = collect.entrySet().stream().filter(entry -> entry.getValue() == 1L)
				.map(entry -> entry.getKey()).findFirst().get();

		System.out.println(character);

		// find the first repeated character in it using java 8
		System.out.println("=================================");

		LinkedHashMap<Character, Long> collect2 = string.chars()
				.mapToObj(s -> Character.toUpperCase(Character.valueOf((char) s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Character character2 = collect2.entrySet().stream().filter(entry -> entry.getValue() > 1L)
				.map(entry -> entry.getKey()).findFirst().get();
		System.out.println(character2);

	}

}