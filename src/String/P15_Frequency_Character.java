package String;

public class P15_Frequency_Character {

	public static void main(String[] args) {

		String str = "naresh motwani";
		int[] freq = new int[str.length()];
		int i, j;
		char[] string = str.toCharArray();
		for (i = 0; i < string.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j]) {
					freq[i]++;
					string[j] = '0';
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies");
		for (i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0')
				System.out.print(string[i] + "-" + freq[i] + ",");
		}
	}
}