package j8p;

import java.util.Arrays;
import java.util.List;

public class P05_FindMaxAndMinNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 2, 8, 49, 25, 98, 100, 32, 15);

		int maxNumber = list.stream().max(Integer::compare).get();

		int minNumber = list.stream().min(Integer::compare).get();

		System.out.println(String.format("Minimum Element->%s ,Maximum Element->%s", minNumber, maxNumber));

	}

}
