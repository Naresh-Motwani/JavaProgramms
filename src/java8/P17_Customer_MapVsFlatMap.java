package java8;

import java.util.List;
import java.util.stream.Collectors;

public class P17_Customer_MapVsFlatMap {

	public static void main(String[] args) {

		List<P17_Customer_i> customers = P17_Customer_Database_ii.getAll();

		/*
		 * List<P17_Customer_i> convert List<String> -> Data Transformation mapping :
		 * customer -> customer.getEmail() Here we are getting one mail id for one
		 * customer so one to one mapping
		 */

		List<String> email = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(email + "Email in map");

		// here we are getting stream of stream because one custome have multi phone
		// number so in this case we go for flatMap (one to many mapping)
		List<List<String>> phoneNumber = customers.stream().map(customer -> customer.getNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumber + "Phone Number in map");

		System.out.println("Use of FlatMap");

		List<String> numberList = customers.stream().flatMap(customer -> customer.getNumbers().stream())
				.collect(Collectors.toList());

		customers.stream().map(P17_Customer_i::getNumbers).flatMap(s -> s.stream()).forEach(System.out::println);
		System.out.println(numberList + "Phone Number in flatmap");
	}

}
