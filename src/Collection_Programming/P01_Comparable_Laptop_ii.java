package Collection_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P01_Comparable_Laptop_ii {

	public static void main(String[] args) {

		List<P01_Comparable_Laptop_i> laptop = new ArrayList<P01_Comparable_Laptop_i>();
		laptop.add(new P01_Comparable_Laptop_i("Dell", 800, 16, "White"));
		laptop.add(new P01_Comparable_Laptop_i("Apple", 1200, 8, "Grey"));
		laptop.add(new P01_Comparable_Laptop_i("HP", 900, 16, "Black"));

		Collections.sort(laptop);

		for (P01_Comparable_Laptop_i l : laptop) {
			System.out.println(l);
		}
	}

}
