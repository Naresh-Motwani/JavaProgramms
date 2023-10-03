package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P04_Duplicate_Element {
	public static void main(String[] args) {

		int[] arr = { 6, 7, 3, 4, 5, 4 };

		Arrays.sort(arr);
		System.out.println("=========First Method =====================");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Duplicate element is " + arr[i]);
			}
		}
		System.out.println("======Second Method=================");

		Set<Integer> uniqueInteger = new HashSet<>();
		boolean isDuplicate = false;
		for (int i = 0; i < arr.length; i++) {

			if (uniqueInteger.contains(arr[i])) {
				isDuplicate = true;
				System.out.println("Duplicate element is " + arr[i]);
			} else {
				uniqueInteger.add(arr[i]);
			}
		}
		if (!isDuplicate) {
			System.out.println(-1);
		}

		System.out.println("=========Third Method =====================");

		Set<Integer> uniqueNumbers = new HashSet<>();
		for (Integer num : arr) {
			if (!uniqueNumbers.add(num)) {
				System.out.println("Duplicate element is " + num);
			}
		}

		System.out.println("======================================");

	}
}
