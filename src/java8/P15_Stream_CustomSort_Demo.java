package java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P15_Stream_CustomSort_Demo {

	public static void main(String[] args) {

		List<P13_Stream_Project_Employee> list = P13_Stream_Project_DataBase.getEmployees();

		Collections.sort(list, new MyComparator());
		System.out.println("Employee List Base on salary assending ==>>" + list);
	}

}

class MyComparator implements Comparator<P13_Stream_Project_Employee> {

	@Override
	public int compare(P13_Stream_Project_Employee o1, P13_Stream_Project_Employee o2) {
		return o2.getSalary() - o1.getSalary();
	}

}