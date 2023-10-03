package java8;

import java.util.function.Consumer;

/*Consumer class is the functional class which have one abstract method accept() method. 
for consumer class we do not have return its void. */
public class P07_Consumer_Demo_With_Lambda {

	public static void main(String[] args) {

		Consumer<String> consumer = (t) -> System.out.println("Name :-> " + t);
		consumer.accept("Consumer Functional interface with lambda expression is working fine ");

	}

}
