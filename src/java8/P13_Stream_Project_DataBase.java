package java8;

import java.util.ArrayList;
import java.util.List;

public class P13_Stream_Project_DataBase {

	public static List<P13_Stream_Project_Employee> getEmployees() {
		List<P13_Stream_Project_Employee> list = new ArrayList<>();
		list.add(new P13_Stream_Project_Employee(01, 20000, "Naresh", "WU"));
		list.add(new P13_Stream_Project_Employee(02, 25000, "Mohit", "JP"));
		list.add(new P13_Stream_Project_Employee(03, 22000, "Lokesh", "JPR"));
		list.add(new P13_Stream_Project_Employee(04, 40000, "Mehta", "ECO"));
		list.add(new P13_Stream_Project_Employee(05, 35000, "Rahul", "MG")); 
		return list;

	}

}
