package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class P16_SortMap_Demo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Eight", 8);
		map.put("Ten", 10);
		map.put("Seven", 7);
		map.put("Five", 5);
		map.put("Nine", 9);
		map.put("Two", 2);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		// Tradional Aproch
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		// With Lambda
		System.out.println("------------------------------------------------------");
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("---------------------------------------------------------");
		// with stream api and lambda
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
