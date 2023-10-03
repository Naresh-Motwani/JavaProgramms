package String;

public class P13_Duplicate_Char {

	public static void main(String[] args) {

		String str = "Naresh Motwani";
		str=str.toLowerCase();
		int count, i, j;
		char string[] = str.toCharArray();
		System.out.println("Duplicate characters in a given string: ");
		for (i = 0; i < string.length; i++) {
			count = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					string[j] = '0';
				}
			}
			if (count > 1 && string[i] != '0')
				System.out.print(string[i] + " ");
		}
	}
}