package java8;

import java.util.Arrays;
import java.util.List;

public class P07_Consumer_Demo_With_LambdaAndStreamAPI {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("A", "B", "D", "C", "E", "F");
		nameList.stream().forEach((t) -> System.out.println("Print :-> " + t));

		

	}
}