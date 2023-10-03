package Arrays;

public class P07_Max_Min_Element {

	public static void main(String[] args) {

		int[] arr = new int[] { 25, 11, 7, 75, 56, 5, 99, -2 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max " + max + " Min " + min);
	}
}