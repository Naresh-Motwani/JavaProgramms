package String;

public class P14_CountNumberOfWordsInString {
	public static void main(String[] args) {
		method1();
		method2();
	}

	private static void method1() {
		final String str = "java developers guide";
		String[] strArray = str.split(" ");
		System.out.println("Number of words in a  " + str + " = " + strArray.length);
	}

	private static void method2() {
		final String str = "java developers guide";
		int count = 0;
		for (String word : str.split(" ")) {
			count++;
		}
		System.out.println("Number of words in a string = " + count);
	}

	
}
