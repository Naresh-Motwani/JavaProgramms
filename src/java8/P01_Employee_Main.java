package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P01_Employee_Main {

	public static void main(String[] args) {

		List<P01_Employee> employeesList = new ArrayList<>();

		employeesList.add(new P01_Employee(001, "Aashish", 26, "M", 78500.00, "2019", 100, "Develoment", "active",
				Arrays.asList("P1", "P2")));
		employeesList.add(new P01_Employee(002, "Mohit", 27, "M", 70000.00, "2020", 101, "Analyst", "active",
				Arrays.asList("P1", "P2", "P3")));
		employeesList.add(new P01_Employee(003, "Rahul", 28, "M", 80000.00, "2021", 102, "Testing", "active",
				Arrays.asList("P1", "P2")));
		employeesList.add(new P01_Employee(004, "Naresh", 25, "M", 65000.00, "2020", 100, "Develoment", "active",
				Arrays.asList("P3")));
		employeesList.add(new P01_Employee(005, "Maya", 26, "F", 72000.00, "2021", 101, "Analyst", "Inactive",
				Arrays.asList("P2", "P3")));
		employeesList.add(new P01_Employee(006, "Radha", 28, "F", 85000.00, "2018", 102, "Testing", "active",
				Arrays.asList("P2", "P3")));

		// print employee details working in each department
		Map<Integer, List<P01_Employee>> empListBaseOnDept = employeesList.stream()
				.collect(Collectors.groupingBy(P01_Employee::getDeptId, Collectors.toList()));

		empListBaseOnDept.entrySet().forEach(entry -> System.out.println(entry.getKey() + " --- " + entry.getValue()));
		System.out.println("=============================================");

		// print employee count working in each department name
		Map<String, Long> empListBaseOnDeptName = employeesList.stream()
				.collect(Collectors.groupingBy(P01_Employee::getDeptName, Collectors.counting()));

		empListBaseOnDeptName.entrySet().forEach(
				entry -> System.out.println("Departart Name :->" + entry.getKey() + "Count is " + entry.getValue()));
		System.out.println("=============================================");

		// print active and inactive employees
		long activeCount = employeesList.stream().filter(e -> "active".equals(e.getStatus())).count();
		long InactiveCount = employeesList.stream().filter(e -> "Inactive".equals(e.getStatus())).count();

		System.out.println("Active " + activeCount + " Inactive " + InactiveCount);
		System.out.println("=============================================");

		// print min/Max salary in Org.
		Optional<P01_Employee> max = employeesList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(P01_Employee::getSalary)));

		Optional<P01_Employee> min = employeesList.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(P01_Employee::getSalary)));

		Optional<P01_Employee> maxSalary = employeesList.stream().max(Comparator.comparing(P01_Employee::getSalary));

		Optional<P01_Employee> minSalary = employeesList.stream().min(Comparator.comparing(P01_Employee::getSalary));

		System.out.println("Max Salary " + max + " also " + maxSalary);
		System.out.println("Min salary " + min + " also " + minSalary);
		System.out.println("=============================================");

		// print min/max salary of an employee from each deptartment

		Map<Integer, Optional<P01_Employee>> maxSalaryByDept = employeesList.stream()
				.collect(Collectors.groupingBy(P01_Employee::getDeptId,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(P01_Employee::getSalary)))));

		maxSalaryByDept.entrySet().forEach(entry -> System.out
				.println("Deptartment " + entry.getKey() + " Top employee salary" + entry.getValue()));
		System.out.println("=============================================");

		// print the average salary in each department

		Map<String, Double> deptAvgSalary = employeesList.stream().collect(
				Collectors.groupingBy(P01_Employee::getDeptName, Collectors.averagingDouble(P01_Employee::getSalary)));

		System.out.println(deptAvgSalary);

		Set<Entry<String, Double>> entrySet = deptAvgSalary.entrySet();

		for (Entry<String, Double> e : entrySet) {
			System.out.println(e.getKey() + " -->> " + e.getValue());
		}

		deptAvgSalary.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -->> " + entry.getValue()));

		System.out.println("=============================================");

		// print male and female are in Org.
		Map<String, Long> gender = employeesList.stream()
				.collect(Collectors.groupingBy(P01_Employee::getGender, Collectors.counting()));

		gender.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -->> " + entry.getValue()));
		System.out.println("=============================================");

		// print all the departments in org.
		List<Integer> departmentList = employeesList.stream().map(P01_Employee::getDeptId).distinct()
				.collect(Collectors.toList());
		System.out.println("Depatment " + departmentList);

		System.out.println("=============================================");

		// print average age of male and female in org

		Map<String, Double> averageAge = employeesList.stream()
				.collect(Collectors.groupingBy(P01_Employee::getGender, Collectors.averagingInt(P01_Employee::getAge)));

		averageAge.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -->> " + entry.getValue()));
		System.out.println("=============================================");

		// print the employee who's age is less than 25

		List<P01_Employee> filterAge = employeesList.stream().filter(e -> e.getAge() > 25).collect(Collectors.toList());

		System.out.println("Employees who is less than 25 --> " + filterAge);
		System.out.println("=============================================");

		// print youngest male employee in Development
		Optional<P01_Employee> minAge = employeesList.stream()
				.filter(e -> e.getGender() == "M" && e.getDeptName() == "Develoment")
				.min(Comparator.comparingInt(P01_Employee::getAge));

		System.out.println("Youngest Male Employee in Develoment department " + minAge);

		System.out.println("=============================================");

		// get the details who is most working exp. in Org.

		Optional<P01_Employee> findFirst = employeesList.stream().sorted((o1, o2) -> o1.getDoj().compareTo(o2.getDoj()))
				.findFirst();

		System.out.println(findFirst);

		System.out.println("=============================================");

		// get the details of projects

		List<List<String>> collect = employeesList.stream().map(e -> e.getProject()).collect(Collectors.toList());

		System.out.println(collect);

		List<String> collect2 = employeesList.stream().flatMap(e -> e.getProject().stream())
				.collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println("=============================================");

		// Unique project list

		Set<String> collect3 = employeesList.stream().flatMap(e -> e.getProject().stream()).collect(Collectors.toSet());
		System.out.println(collect3);

		System.out.println("=============================================");

		// print the Empoyee who age is greater 26 and salary hike 10%

		List<P01_Employee> ei = employeesList.stream().filter(e -> e.getAge() > 26)
				.map(e -> new P01_Employee(e.getEmpId(), e.getEmpName(), e.getAge(), e.getGender(),
						e.getSalary() * 1.10, e.getDoj(), e.getDeptId(), e.getDeptName(), e.getStatus(),
						e.getProject()))
				.collect(Collectors.toList());

		System.out.println("Employee who's age is greater 26 and salary hike 10%  ==>> " + ei);
		System.out.println("++++++++++++++Method 2+++++");

		List<P01_Employee> eii = employeesList.stream().map(e -> {
			if (e.getAge() > 26) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList());

		System.out.println(eii);

		System.out.println("=============================================");

		P01_Employee orElse = employeesList.stream().findFirst().orElse(null);

		System.out.println(orElse);
		System.out.println("=============================================");

		// print the employee who have salary more then 70000.00 and base on name

		List<String> sort = employeesList.stream().filter(e -> e.getSalary() > 70000.00).map(P01_Employee::getEmpName)
				.sorted().collect(Collectors.toList());
		System.out.println(sort);
		System.out.println("=============================================");
		System.out.println("=============================================");
		System.out.println("=============================================");
		System.out.println("=============================================");

	}

}
