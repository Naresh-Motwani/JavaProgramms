package Collection_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P06_Student_ArrayList_Comparable_DefaultSort {

	public static void main(String[] args) {

		List<P06_Student> list = new ArrayList<P06_Student>();
		list.add(new P06_Student("Naresh", "Eight", 12, 12));
		list.add(new P06_Student("Rahul", "Eight", 12, 20));
		list.add(new P06_Student("Mehta", "Eight", 13, 10));
		list.add(new P06_Student("Lokesh", "Eight", 12, 17));

		System.out.println("Before" + list);

		Collections.sort(list);

		System.out.println("After" + list);

	}
}