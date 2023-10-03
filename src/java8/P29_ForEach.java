package java8;

import java.util.ArrayList;
import java.util.List;

public class P29_ForEach {

	public static void main(String[] args) {

		List<P29_ForEach_Person> person = new ArrayList<>();

		person.add(new P29_ForEach_Person(26, "Naresh"));
		person.add(new P29_ForEach_Person(28, "Lokesh"));
		person.add(new P29_ForEach_Person(29, "Rahul"));
		person.add(new P29_ForEach_Person(24, "Mehta"));

		person.forEach((p) -> System.out.println(p.getName() + " " + p.getAge()));
	}
}