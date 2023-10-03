package java8;

import java.util.List;
import java.util.stream.Collectors;

public class P13_Stream_Project_TaxCal {

	public List<P13_Stream_Project_Employee> evalutEmployees() {
		return P13_Stream_Project_DataBase.getEmployees().stream().filter((sal) -> sal.getSalary() > 22000)
				.collect(Collectors.toList());

	}

	public static List<P13_Stream_Project_Employee> taxEmployees(String inputString) {
		return (inputString.equalsIgnoreCase("tax"))
				? P13_Stream_Project_DataBase.getEmployees().stream().filter((sal) -> sal.getSalary() > 22000)
						.collect(Collectors.toList())
				: P13_Stream_Project_DataBase.getEmployees().stream().filter((sal) -> sal.getSalary() <= 22000)
						.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		P13_Stream_Project_TaxCal taxCal = new P13_Stream_Project_TaxCal();
		System.out.println(taxCal.evalutEmployees());
		System.out.println("-------------------");
		System.out.println(P13_Stream_Project_TaxCal.taxEmployees("Non TAX"));
	}

}
