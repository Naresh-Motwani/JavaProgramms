package expriment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Interview_Question_Mphasis {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(10, 12, 15, 20, 22, 29, 30, 200));

		int[] a = { 10, 12, 15, 20, 22, 29, 30, 200 };

		int length = a.length;

		for (int i = 0; i < length; i++) {

			if (a[i] == 30) {
				System.out.println("yes");
			}
		}

		String[] array = Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);

		List<String> collect = Arrays.stream(array).filter((t) -> t.startsWith("2")).collect(Collectors.toList());

		Set<String> collect2 = Arrays.stream(array).filter((t) -> t.contains("30")).collect(Collectors.toSet());

		for (String s : collect) {
			System.out.println(s);
		}
		System.out.println(collect + "+======================");

		for (String s : collect2) {
			System.out.print(s);
		}
	}
}