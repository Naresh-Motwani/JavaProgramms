package Collection_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P05_Array_Convert_ArrayList {

	public static void main(String[] args) {

		String[] cityname = { "Agra", "Jaipur", "Mumbai", "Bangalore", "Bhopal", "Ajmer" };

		ArrayList<String> cityList = new ArrayList<>(Arrays.asList(cityname));

		System.out.println(cityList);
		System.out.println(cityList.get(1));

		if (cityList.contains("Bangalore")) {
			System.out.println("Welcome to Bangalore ");
		} else {
			System.out.println("Ohhps you are in some other city ");
		}

		List<String> otherCity = new ArrayList<>(Arrays.asList("Kota", "Kolkata", "Indore"));
		cityList.addAll(otherCity);

		for (String citys : cityList) {

			System.out.println(citys);

		}
	}

}
