package expriment;

public class GetHello {

	public static void main(String[] args) {

		String string = "getHello";
		String aString = "";
		String bString = "";

		int lenght = string.length();

		char[] ch = string.toCharArray();

		for (int i = 0; i < lenght; i++) {
			if (ch[i] == 'H') {
				aString += '_';
				aString += ch[i];
			} else {
				aString += ch[i];
			}
		}
		System.out.println(string + " Result " + aString.toLowerCase());

		char[] c = aString.toCharArray();

		for (int i = 0; i < lenght + 1; i++) {
			if (c[i] == '_') {
			} else {
				bString += c[i];
			}
		}
		System.out.println(bString);
	}

}
