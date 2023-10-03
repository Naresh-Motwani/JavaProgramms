package java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P15_Stream_CustomSort_Lambda_Demo {

	public static void main(String[] args) {
		List<P13_Stream_Project_Employee> employees = P13_Stream_Project_DataBase.getEmployees();

		System.out.println("Treadtional way");

		Collections.sort(employees, new Comparator<P13_Stream_Project_Employee>() {

			@Override
			public int compare(P13_Stream_Project_Employee o1, P13_Stream_Project_Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}

		});
		System.out.println(employees);

		System.out.println("By using Lambda");

		Collections.sort(employees, (o1, o2) -> o2.getSalary() - o1.getSalary());
		System.out.println("--" + employees);

		System.out.println("By using stream and lambda");

		employees.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary()).forEach((t) -> System.out.println(t));
		System.out.println("------------------------");
		employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
		System.out.println("------------------------");
		employees.stream().sorted(Comparator.comparing(P13_Stream_Project_Employee :: getName)).forEach(System.out::println);

	}
}
