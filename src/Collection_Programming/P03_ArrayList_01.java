package Collection_Programming;

import java.util.ArrayList;
import java.util.List;

public class P03_ArrayList_01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Naresh");
		list.add("Rahul");
		list.add("Harish");

		System.out.println(list);

		System.out.println(list.get(1));

		System.out.println(list.contains("Harish"));

		System.out.println(list.isEmpty());

		System.out.println(list.remove(0));
		System.out.println(list);

		int hashCode = list.hashCode();
		System.out.println(hashCode);

	}

}
