package expriment;

//Sort the Map base on value and return the Map also. 

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Collection_Map_Java8_Stream {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Naresh", 3);
		map.put("Rahul", 2);
		map.put("Lokesh", 1);
		map.put("Zuber", 4);

		LinkedHashMap<String, Integer> hashMap = map.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue() - e2.getValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(hashMap);

		LinkedHashMap<String, Integer> linkedHashMap = map.entrySet().stream()
				.sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Linked Hash Map==>> " + linkedHashMap);

	}
}