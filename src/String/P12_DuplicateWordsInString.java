package String;

public class P12_DuplicateWordsInString {

	public static void main(String[] args) {

		String str = "Jai Mata Dii";
		str = str.toLowerCase();
		int count, i, j;

		String[] split = str.split(" ");

		for (i = 0; i < split.length; i++) {
			count = 1;
			for (j = i + 1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					count++;
					split[j] = "0";
				}
			}
			if (count > 1 && split[i] != "0") {
				System.out.print(split[i]+" ");
			}
		}

	}

}