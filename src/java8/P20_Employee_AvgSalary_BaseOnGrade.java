package java8;

public class P20_Employee_AvgSalary_BaseOnGrade {

	public static void main(String[] args) {

		Double avgSalary = P20_Employee_Database.getAllEmployee().stream()
				.filter((employee) -> employee.getGrade().equalsIgnoreCase("B")).map(P20_Employee::getSalary)
				.mapToInt(i -> i).average().getAsDouble();

		System.out.println("Average Salary of Grade A ==>> " + avgSalary);

	}

}
