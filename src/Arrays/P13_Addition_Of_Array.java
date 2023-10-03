package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P13_Addition_Of_Array {

	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 7, 9 };
		int[] b = { 2, 4, 6, 8 };

		int[] c = new int[a.length + b.length];
		System.out.println(c.length);

		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
	}

}
