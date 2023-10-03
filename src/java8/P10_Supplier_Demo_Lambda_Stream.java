package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class P10_Supplier_Demo_Lambda_Stream {

	public static void main(String[] args) {

		Supplier<String> supplier = () -> {
			return "Hi";
		};

		Supplier<String> supplier2 = () -> "Hi Naresh ";
		System.out.println(supplier.get());
		System.out.println(supplier2.get());

		System.out.println("----------------------Stream Api with lambda and Supplier");

		List<String> numIntegers = Arrays.asList();
		System.out.println(numIntegers.stream().findAny().orElseGet(supplier2));
	}

}
