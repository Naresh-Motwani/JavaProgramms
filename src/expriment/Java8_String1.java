package expriment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_String1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11.5"));

		Double sum = list.stream().map(a -> Double.parseDouble(a)).reduce(Double::sum).get();
		System.out.println(sum);

	}

}
