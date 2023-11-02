package Collection_Programming;

//Functional Programming 

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapWithGeneric {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Naresh");
		map.put(104, "Rahul");
		map.put(103, "Mehta");
		map.put(102, "JD");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " == " + m.getValue());
		}
		System.out.println("---------Compare By key in asd");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("///////////////Compare By key in dsd");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		System.out.println("============Compare by value in asd");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		System.out.println("============Compare by value in dsd");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);

	}

}
