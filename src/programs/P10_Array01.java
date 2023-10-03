package programs;

//WAP to understand Array.
public class P10_Array01 {

	public static void main(String[] args) {

		String[] namStrings = { "Rahul", "Naresh", "Lokesh", "Sandeep", "Vicky" };
		int i = 0;
		System.out.println("------------First------------------------");
		while (i < namStrings.length) {
			System.out.println(namStrings[i]);
			i++;

		}
		System.out.println("------------Second------------------------");
		for (int j = 0; j < namStrings.length; j++) {
			System.out.println(namStrings[j]);

		}
		System.out.println("------------Third------------------------");
		for (String k : namStrings) {
			System.out.println(k);
		}
	}
}
