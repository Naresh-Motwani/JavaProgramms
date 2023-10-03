package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class P11_Stream_ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Naresh");
		list.add("Rahul");
		list.add("Mohit");
		list.add("Lokesh");
		list.add("Mehta");

		for (String name : list) {
			System.out.println("Name : " + name);
		}
		System.out.println("-----------------------");
		list.stream().forEach((t) -> System.out.println("Name : " + t));

		Map<Integer, String> map = new HashMap<>();
		map.put(01, "Naresh");
		map.put(02, "Rahul");
		map.put(03, "Mohit");
		map.put(04, "Lokesh");
		map.put(05, "Mehta");

		map.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println("////////////////////////////////////////");
		map.entrySet().stream().forEach((t) -> System.out.println(t));
	}
}