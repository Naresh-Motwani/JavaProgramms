package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P20_Employee_Database {

	public static List<P20_Employee> getAllEmployee() {
		return Stream.of(new P20_Employee(01, 20000, "Naresh", "A"), new P20_Employee(02, 40000, "Mehta", "B"),
				new P20_Employee(03, 25000, "Lokesh", "A"), new P20_Employee(04, 35000, "Rahul", "C"),
				new P20_Employee(05, 23000, "JD", "A")).collect(Collectors.toList());

	}
}
