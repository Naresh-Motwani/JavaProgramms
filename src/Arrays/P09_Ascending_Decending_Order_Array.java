package Arrays;

public class P09_Ascending_Decending_Order_Array {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;

		System.out.println("Ascending Order ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		System.out.println("decending Order ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}