package expriment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Programms {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 1, 3));
		System.out.println(list);

		// Map method
		List<Integer> list1 = list.stream().map(a -> a + a).collect(Collectors.toList());
		System.out.println(list1);
		
		// Map with Set interface
		Set<Integer> set = list.stream().map(a -> a + a).collect(Collectors.toSet());
		System.out.println(set);
		
		// Filter method
		List<Integer> list2 = list.stream().filter((a) -> a.equals(4)).collect(Collectors.toList());
		System.out.println(list2);

		List<String> name = new ArrayList<>();
		name.add("Naresh");
		name.add("Naveen");
		name.add("Rahul");
		name.add("Mahit");
		name.add("Mehta");
		name.add("Zuber");
		name.add("Naresh");

		// filter the array base on matching
		List<String> filternameList = name.stream().filter((a) -> a.startsWith("M")).collect(Collectors.toList());
		System.out.println(filternameList);

		// Sort the arraylist
		List<String> sortnameList = name.stream().sorted().collect(Collectors.toList());
		System.out.println(sortnameList);

		// collect method
		Set<String> setsortnameSet = name.stream().collect(Collectors.toSet());
		System.out.println(setsortnameSet);

		// forEach method
		name.stream().forEach(a -> System.out.print(a + " , "));
		System.out.println();
		name.stream().sorted().forEach(a -> System.out.print(a + " / "));
		System.out.println();

		// reduce method for
		int sum = list.stream().reduce(0, (ans, i) -> ans + i);
		System.out.println("Sum of list is " + sum);
	}
}