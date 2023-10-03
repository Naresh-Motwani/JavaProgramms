package Collection_Programming;

//Find the duplicate element in List then convert into set and print duplicate.

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P08_Duplicate_Element_List_Set {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 1, 5, 7, 2, 5, 5, 1, 7, 7, 1, 5, 1, 8, 8);

		Set<Integer> set = new HashSet<>();
		Set<Integer> tset = new HashSet<>();

		for (Integer a : list) {
			if (!set.add(a)) {
				tset.add(a);
			}
		}
		System.out.println("duplicated==>>" + tset);
		System.out.println(set);

		set.removeAll(tset);
		System.out.println("===" + set);
	}
}