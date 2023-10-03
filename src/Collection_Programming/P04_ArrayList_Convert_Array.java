package Collection_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P04_ArrayList_Convert_Array {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>(Arrays.asList("Mango", "Orange", "Apply", "Banana"));

		String[] fruitString = fruits.toArray(new String[fruits.size()]);

		for (String f : fruitString) {
			System.out.println("Fruit name is :==>> " + f);
		}

	}

}
