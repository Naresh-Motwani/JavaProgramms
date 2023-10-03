package String;

public class P02_Count_Vowel {

	public static void main(String[] args) {

		int vCount = 0, cCount = 0;

		String name = "This is a really simple sentence"; 
		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				vCount++;
			} else if(name.charAt(i)>='a'&&name.charAt(i)<='z'){
				cCount++;
			}
		}
		System.out.print("Vowel " + vCount + " Consonant " + cCount);
	}

}
