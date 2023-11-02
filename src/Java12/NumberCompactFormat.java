package Java12;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberCompactFormat {

	public static void main(String[] args) {

		NumberFormat compactNumberInstance = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

		NumberFormat compactNumberInstanceShort = NumberFormat.getCompactNumberInstance(Locale.US,
				NumberFormat.Style.SHORT);

		System.out.println(compactNumberInstance.format(1000000));
		System.out.println(compactNumberInstanceShort.format(1000000));

	}

}
