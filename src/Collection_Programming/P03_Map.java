package Collection_Programming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P03_Map {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four", 4);
		hm.put("Five", 5);

		for (Map.Entry<String, Integer> me : hm.entrySet()) {
			System.out.println(me.getValue() + " " + me.getKey());
		}
		System.out.println("===============================");
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Naresh", 1);
		map.put("Rahul", 2);
		map.put("Mohit", 3);
		map.put("Mehta", 4);
		map.put("JD", 5);

		for (Map.Entry<String, Integer> op : map.entrySet()) {
			System.out.println(op.getKey() + " " + op.getValue());
		}
		System.out.println("===============================");
		Map<String, Integer> m = new TreeMap<>();
		m.put("Vansh", 500);
		m.put("Prateek", 200);
		m.put("Maya", 1000);
		m.put("Baby", 100);

		for (Map.Entry<String, Integer> po : m.entrySet()) {
			System.out.println(po.getValue() + " " + po.getKey());
		}

		System.out.println("Size==>>" + m.size());

		if (hm.containsKey("One")) {
			Integer key = hm.get("One");
			System.out.println(key);
		}
	}
}