package Arrays;

public class P10_3rd_Largest_Number {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };

		System.out.println("Third Largest: " + getThirdLargest(a, a.length));
		System.out.println("Second Largest: " + getSecondLargest(b, b.length));
		System.out.println("Largest Number: "+ getLargest(a,a.length));
	}

	private static int getThirdLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int ele : a) {
			System.out.print(ele + " ");
		}
		System.out.println();
		return a[total - 3];

	}

	private static int getSecondLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int ele : a) {
			System.out.print(ele + " ");
		}
		System.out.println();
		return a[total - 2];

	}
	private static int getLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int ele : a) {
			System.out.print(ele + " ");
		}
		System.out.println();
		return a[total - 1];

	}

}