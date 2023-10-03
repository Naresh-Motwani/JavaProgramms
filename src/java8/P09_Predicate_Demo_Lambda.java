package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P09_Predicate_Demo_Lambda {

	public static void main(String[] args) {

		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};

		Predicate<Integer> predicate2 = (t) -> t % 2 == 0;

		System.out.println(predicate2.test(9));
//-------Stream Api have filter method which consume predicate then foreach then lambda
//-------Filter method internally call predicate method 
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		list.stream().filter(predicate2).forEach((t) -> System.out.println("Even :-> " + t));

	}

}
