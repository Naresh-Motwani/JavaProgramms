package Collection_Programming;

import java.util.HashMap;
import java.util.Map;

public class P02_Employee_HashMap_ii {

	public static void main(String[] args) {

		Map<Integer, P02_Employee> employees = new HashMap<>();

		employees.put(103, new P02_Employee(101, "Naresh", "Mphasis", 1001));
		employees.put(104, new P02_Employee(102, "Rahul", "HCL", 1002));
		employees.put(101, new P02_Employee(103, "Mehta", "TCS", 1003));
		employees.put(102, new P02_Employee(104, "JD", "Mphasis", 1004));

		employees.forEach((k, v) -> System.out.println(k + " = " + v));
	}
}
