package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P01_Product_DAO {

	public static List<P01_Product> getAll() {
		return Stream.of( new P01_Product(101, "Soap", 455.55, "Mumbai", Arrays.asList("LUX", "Dove", "MysoreSandal")),
				new P01_Product(102, "Shampoo", 850.00, "Bangalore",Arrays.asList("Sunsilk", "Clinic Plus", "Head & Shoulders")),
				new P01_Product(103, "Oil", 780.50, "Kolkata", Arrays.asList("FlaxSeed", "Coconut oil", "Sesame oil")))
				.collect(Collectors.toList());

	}
}