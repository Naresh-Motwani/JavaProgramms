package java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class P33_Sort_Map {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Naresh", 2);
		map.put("Rahul", 3);
		map.put("Lokehs", 5);
		map.put("Zuber", 1);
		map.put("Mehta", 4);
		map.put("JD", 6);

		LinkedHashMap<String, Integer> hashMap = map.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue() - e2.getValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(hashMap);

		LinkedHashMap<String, Integer> collect = map.entrySet().stream()
				.sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(collect);

	}

}
