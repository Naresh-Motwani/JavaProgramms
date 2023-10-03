package Arrays;

public class P05_Reverse_Array {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Reverse array");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
