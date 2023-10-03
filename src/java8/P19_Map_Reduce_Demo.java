package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class P19_Map_Reduce_Demo {

	public static void main(String[] args) {

		List<Integer> numbersIntegers = Arrays.asList(1, 2, 3, 9, 8, 7, 5, 6, 4);

		int sum = 0;
		for (int num : numbersIntegers) {
			sum += num;
		}
		System.out.println("Normal " + sum);

		int mapSum = numbersIntegers.stream().mapToInt((i) -> i).sum();
		System.out.println("Map " + mapSum);

		Integer reduceSum = numbersIntegers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Reduce " + reduceSum);

		Optional<Integer> reduceSumWithMethodReference = numbersIntegers.stream().reduce(Integer::sum);
		System.out.println("Optional " + reduceSumWithMethodReference.get());

		Integer maxInteger = numbersIntegers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println("Max value " + maxInteger);

		List<String> wordList = Arrays.asList("Naresh", "Lokesh", "Rahul", "Mohit", "Zuber", "Vibhashish");
		String longestWord = wordList.stream()
				.reduce((wordList1, wordList2) -> wordList1.length() > wordList2.length() ? wordList1 : wordList2)
				.get();
		System.out.println("Longest Name :==>> " + longestWord);
	}

}
