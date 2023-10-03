package java8;

import java.util.function.Predicate;

public class P08_Predicate_Demo implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {

			return false;
		}
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = new P08_Predicate_Demo();
		System.out.println(predicate.test(8));
	}
}
