package Arrays;

public class P06_Even_Position_Element {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

		System.out.println("Even position Element's");
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Odd position Element's");
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
	}
}