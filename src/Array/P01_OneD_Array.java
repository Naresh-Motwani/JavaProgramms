package Array;

public class P01_OneD_Array {

	public static void main(String[] args) {

		System.out.println("Added line to check");

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
