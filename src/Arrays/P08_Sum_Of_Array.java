package Arrays;

public class P08_Sum_Of_Array {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		/*
		 * for (int i = 0; i < arr.length; i++) { sum += arr[i]; }
		 */
		for (int ele : arr) {
			sum += ele;
		}
		System.out.println("Sum ==>> " + sum);
	}
}