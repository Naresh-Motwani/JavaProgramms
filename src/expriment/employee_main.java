package expriment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class employee_main {

	static List<employee> employees = new ArrayList<employee>();

	static {
		employees.add(new employee("naresh", 0));
		employees.add(new employee("Rahul", 20));
		employees.add(new employee("Lokesh", 35));

	}

	public static void main(String[] args) {

		List<employee> collect = employees.stream().filter((e) -> e.getAge() != 0).collect(Collectors.toList());

		System.out.println(collect);

	}

}
