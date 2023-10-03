package java8;

import java.util.Arrays;
import java.util.Optional;

public class P18_Optional_Demo {

	public static void main(String[] args) {

		P17_Customer_i customer = new P17_Customer_i(01, "Naresh", null, Arrays.asList("123", "234"));

		Optional<Object> emptyOptional = Optional.empty();
		System.out.println("Empty Optional ==>> " + emptyOptional);

		Optional<String> ofNullableOptional = Optional.ofNullable(customer.getEmail());
		System.out.println("Of Nullable optional ==>> " + ofNullableOptional);

		// When we want to get value so before that we can check value is present or not
		if (ofNullableOptional.isPresent()) {
			System.out.println("Value is  ==>> " + ofNullableOptional.get());
		} else {
			System.out.println("Value is Null ");
		}

		System.out.println(
				"Of Nullable optional with orelse method  ==>> " + ofNullableOptional.orElse("default@gmail.com"));

		System.out.println("Checking other methos ==>> "
				+ ofNullableOptional.orElseThrow(() -> new IllegalArgumentException("Email is not present")));

		// if object is have null value then it's throw NullPointerException.
		Optional<String> ofOptional = Optional.of(customer.getEmail());
		System.out.println("Of Optional ==>> " + ofOptional);

	}

}
