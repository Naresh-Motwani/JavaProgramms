package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P12_Stream_FilterDemo {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("Naresh");
		nameList.add("Rahul");
		nameList.add("Mohit");
		nameList.add("Mehta");
		nameList.add("Lokesh");

		for (String name : nameList) {
			if (name.startsWith("M")) {
				System.out.println("Name : " + name);
			}
		}
		System.out.println("----------------------------------");
		nameList.stream().filter((t) -> t.endsWith("h")).forEach((t) -> System.out.println("Name : " + t));

		System.out.println("-----------------------------------------");

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Naresh");
		map.put(02, "Rahul");
		map.put(03, "Mohit");
		map.put(04, "Lokesh");
		map.put(05, "Mehta");

		map.entrySet().stream().filter((t) -> t.getValue().startsWith("M"))
				.forEach((t) -> System.out.println("Name : " + t));
	}

}
