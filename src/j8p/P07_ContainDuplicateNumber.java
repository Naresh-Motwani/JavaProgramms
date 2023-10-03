package j8p;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P07_ContainDuplicateNumber {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2, 2 };

		System.out.println(containDuplicate(nums));
	}

	private static boolean containDuplicate(int[] nums) {
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<Integer>(list);

		if (set.size() == list.size()) {
			return false;

		}
		System.out.println("Yes duplicate contain");
		return true;
	}

}
