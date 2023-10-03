package java8.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {

		List<Person> persons = getPersons();

		System.out.println("-------Imperative Approch-------");
		List<Person> females = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getGender().equals(Gender.FEMALE)) {

				females.add(person);
			}
		}
		females.forEach(System.out::println);

		System.out.println("-------Using Filter-------");
		persons.stream().filter(a -> a.getGender().equals(Gender.MALE)).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("-------Using Sort Age-------");

		persons.stream().filter(a -> a.getGender().equals(Gender.MALE)).sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList()).forEach(System.out::println);
		;

	}

	private static List<Person> getPersons() {
		return List.of(new Person("Naresh", 28, Gender.MALE), new Person("Abhishek", 26, Gender.MALE),
				new Person("Aadya", 25, Gender.FEMALE), new Person("Navya", 26, Gender.FEMALE),
				new Person("Sarun", 27, Gender.MALE)

		);
	}

}
