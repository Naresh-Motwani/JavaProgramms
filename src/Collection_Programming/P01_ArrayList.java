package Collection_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class P01_ArrayList {

	public static void main(String[] args) {

		List<String> colours = new ArrayList<>();

		colours.add("Red");
		colours.add("Blue");
		colours.add("Black");
		colours.add("Orange");
		colours.add("Yellow");
		colours.add("Red");
		colours.add(0, "Brown");
		colours.set(6, "Tan");

		for (String colour : colours) {
			System.out.println("Colous is " + colour);
		}
		System.out.println("=================================");
		colours.remove(4);
		Collections.sort(colours);
		for (String colour : colours) {
			System.out.println("Colous is " + colour);
		}

		List<String> number = new ArrayList<>();
		number.add("Red");
		number.add("Blue");
		number.add("Black");
		number.add("Tan");
		// ArrayList into Array convert.
		String[] numberArray = number.toArray(new String[number.size()]);
		for (String num : numberArray) {
			System.out.println(num);
		}

		HashSet<String> hs = new HashSet<>();
		hs.add("Love");
		hs.add("you");
		hs.add("I");

		Iterator<String> iterator = hs.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string + "+=======+++");
		}

	}
}