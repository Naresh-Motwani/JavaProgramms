package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P14_Stream_SortList_Demo {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();

		nameList.add("Naresh");
		nameList.add("Rahul");
		nameList.add("Mehta");
		nameList.add("Lokesh");
		nameList.add("Mohit");

		Collections.sort(nameList);
		System.out.println("Name : " + nameList);

		Collections.reverse(nameList);
		System.out.println("Name : " + nameList);

		nameList.stream().sorted().forEach((t) -> System.out.println(t));
		nameList.stream().sorted(Comparator.reverseOrder()).forEach((t) -> System.out.println("Reverse : "+t));
	}

}
