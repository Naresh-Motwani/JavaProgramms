package Arrays;

public class P01_Array_Copy {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5,5 };
		int[] b = new int[a.length];

		for (int i = 0; i< a.length ; i++) {
			b[i] = a[i];
		}
		System.out.println("Display element of array B");

		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
