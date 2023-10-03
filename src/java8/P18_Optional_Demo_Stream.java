package java8;

import java.util.List;

public class P18_Optional_Demo_Stream {

	public static P17_Customer_i getCustomerByEmail(String email) throws Exception {

		List<P17_Customer_i> customers = P17_Customer_Database_ii.getAll();

		return customers.stream().filter((customer) -> customer.getEmail().equals(email)).findAny()
				.orElseThrow(() -> new Exception("No such customer present"));

	}

	public static void main(String[] args) throws Exception {

		getCustomerByEmail("abc@gmail.com");

	}

}
