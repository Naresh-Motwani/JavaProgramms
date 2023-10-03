package java8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class P16_SortMap_Custom_Demo {

	public static void main(String[] args) {

		// tradional approch
		Map<P13_Stream_Project_Employee, Integer> map = new TreeMap<>(new Comparator<P13_Stream_Project_Employee>() {

			@Override
			public int compare(P13_Stream_Project_Employee o1, P13_Stream_Project_Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
		});

		map.put(new P13_Stream_Project_Employee(01, 20000, "Naresh", "EC"), 01);
		map.put(new P13_Stream_Project_Employee(02, 30000, "Mohit", "EE"), 02);
		map.put(new P13_Stream_Project_Employee(03, 40000, "Mehta", "IT"), 03);
		map.put(new P13_Stream_Project_Employee(04, 35000, "Rahul", "VLI"), 04);
		map.put(new P13_Stream_Project_Employee(05, 22000, "Lokesh", "CS"), 05);

		System.out.println(map);

		// By using Lambda
		System.out.println("********************************************");
		Map<P13_Stream_Project_Employee, Integer> map2 = new TreeMap<>((o1, o2) -> o2.getSalary() - o1.getSalary());
		map2.put(new P13_Stream_Project_Employee(01, 20000, "Naresh", "EC"), 01);
		map2.put(new P13_Stream_Project_Employee(02, 30000, "Mohit", "EE"), 02);
		map2.put(new P13_Stream_Project_Employee(03, 40000, "Mehta", "IT"), 03);
		map2.put(new P13_Stream_Project_Employee(04, 35000, "Rahul", "VLI"), 04);
		map2.put(new P13_Stream_Project_Employee(05, 22000, "Lokesh", "CS"), 05);

		System.out.println(map2);
		System.out.println("************************************************");
		// By using Stream API
		map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(P13_Stream_Project_Employee::getSalary)))
				.forEach(System.out::println);

	}

}
