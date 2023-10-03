package Collection_Programming;

import java.util.ArrayList;
import java.util.List;

public class P02_ArrayListDemo {

	public static void main(String[] args) {

		List<String> name = new ArrayList<>();
		name.add("Naresh");
		name.add("Rahul");
		name.add("Lokesh");
		name.add("Mehta");
		name.add("Mohit");
		name.add("Zuber");
		name.add("JD");

		for (String s : name) {
			System.out.println("Name :==>> " + s);
		}

		for (int i = 0; i < name.size(); i++) {
			System.out.println("*()* " + name.get(i));

		}
		System.out.println("Stream API with Lambda ");
		name.stream().forEach((t) -> System.out.println(t));
		// Method Reference name.stream().forEach(System.out::println);

		System.out.println("===================================");

		System.out.println("==>" + name);
		System.out.println("My name is " + name.get(0));

	}

}
