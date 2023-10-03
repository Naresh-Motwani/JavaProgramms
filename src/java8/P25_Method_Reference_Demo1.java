package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
	void print(String message);
}

public class P25_Method_Reference_Demo1 {

	public void display(String message) {
		message = message.toUpperCase();
		System.out.println(message);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		// 1. Method reference to a static method
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(4));

		// using method reference
		Function<Integer, Double> function2 = Math::sqrt;
		System.out.println(function2.apply(16));

		// -------------------------------------------------------------------
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> P25_Method_Reference_Demo1.add(a, b);
		System.out.println(biFunction.apply(10, 20));

		BiFunction<Integer, Integer, Integer> biFunction2 = P25_Method_Reference_Demo1::add;
		System.out.println(biFunction2.apply(20, 30));

		// ==2. method reference to an instance method of an object========
		P25_Method_Reference_Demo1 method_Reference = new P25_Method_Reference_Demo1();

		// Using Lambda
		Printable printable = (message) -> method_Reference.display(message);
		printable.print("hello naresh");

		// using method reference
		Printable printableMethodReference = method_Reference::display;
		printableMethodReference.print("hello Rahul");

		// ==3 Reference to the instance method of arbitory object

		// by using lambda
		Function<String, String> stringFunction = (input) -> input.toLowerCase();
		System.out.println(stringFunction.apply("HELLO NARESH"));

		// by using method reference
		Function<String, String> stringFuntionMethodReferenceFunction = String::toLowerCase;
		System.out.println(stringFuntionMethodReferenceFunction.apply("HELLO NARESH  "));

		String[] str = { "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };
		// by using lambda
		Arrays.sort(str, (s1, s2) -> s1.compareToIgnoreCase(s2));
		for (String a : str) {
			System.out.print(a + " ");
		}
		// by using method reference
		System.out.println();
		Arrays.sort(str, String::compareToIgnoreCase);
		for (String a : str) {
			System.out.print(a + " ");
		}
		System.out.println();

		// ==4 Reference to constructor
		List<String> fruit = new ArrayList<String>(Arrays.asList("Mango", "Banana", "Apple", "Mango"));
		// by using lambda
		Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet(fruitList);

		System.out.println(setFunction.apply(fruit));

		// by using method reference

		Function<List<String>, Set<String>> setFuntionMethod = HashSet::new;
		System.out.println(setFunction.apply(fruit));

	}

}
