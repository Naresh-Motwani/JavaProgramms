package java8;

import java.util.stream.IntStream;

public class P21_ParallelStream_Demo {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;

//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Plain Stream Time " + (end - start));
//
//		System.out.println("--------------------------------------");
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).parallel().forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Parallel Stream Time " + (end - start));

		IntStream.range(1, 10)
				.forEach(a -> System.out.println("Thread : " + Thread.currentThread().getName() + " : " + a));

		IntStream.range(1, 10).parallel()
				.forEach(a -> System.out.println("Thread : " + Thread.currentThread().getName() + " : " + a));

	}

}
