package Arrays;

public class P03_Left_Rotate_Array {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5 };

		int rotate = 3;
		System.out.println("Original Array ");
		for (int ele : array) {
			System.out.print(ele + " ");
		}
		System.out.println();

		for (int i = 0; i < rotate; i++) {
			int j, first;
			first = array[0];

			for (j = 0; j < array.length - 1; j++) {
				array[j] = array[j + 1];
			}
			array[j] = first;
		}
		System.out.println("After rotate array " + rotate + " times");
		for (int ele : array) {
			System.out.print(ele + " ");
		}
	}

}
