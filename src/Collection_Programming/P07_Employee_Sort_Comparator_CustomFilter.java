package Collection_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P07_Employee_Sort_Comparator_CustomFilter {

	public static void main(String[] args) {

		List<P07_Employee> employees = new ArrayList<P07_Employee>();
		employees.add(new P07_Employee("A", "naresh@gmail.com", 121, 101));
		employees.add(new P07_Employee("Z", "rahul@gmail.com", 122, 104));
		employees.add(new P07_Employee("M", "naresh@gmail.com", 123, 100));
		employees.add(new P07_Employee("B", "naresh@gmail.com", 124, 102));

		Collections.sort(employees, (o1, o2) -> o2.getName().compareTo(o1.getName()));

		System.out.println(employees);

	}

}
