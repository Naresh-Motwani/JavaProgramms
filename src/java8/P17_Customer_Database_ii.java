package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P17_Customer_Database_ii {

	public static List<P17_Customer_i> getAll() {

		return Stream
				.of(new P17_Customer_i(01, "Naresh", "naresh@gmail.com", Arrays.asList("123", "456")),
						new P17_Customer_i(01, "Rahul", "rahul@gmail.com", Arrays.asList("234", "345")),
						new P17_Customer_i(03, "Lokesh", "lokesh@gmail.com", Arrays.asList("345", "456")))
				.collect(Collectors.toList());

	}

}
