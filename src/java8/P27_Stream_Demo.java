package java8;

import java.util.stream.Stream;

public class P27_Stream_Demo {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("a", "c", "b");

		stream.forEach(System.out::print);

	}

}
