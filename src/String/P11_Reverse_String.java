package String;

public class P11_Reverse_String {

	public static void main(String[] args) {

		String str = "Naresh";
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		System.out.println("Reverse is==>> " + revStr);
	}
}