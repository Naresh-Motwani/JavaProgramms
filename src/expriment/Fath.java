package expriment;

public class Fath {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, -1, -2, -6, 7, -8, 13, -13, -14 };

		int length = a.length;
		int temp1 = 0, temp2 = 0;

		for (int i = 0; i < length; i++) {
			if (a[i] > 0) {

				if (temp1 < a[i])
					temp1 = a[i];

			} else {
				temp2 = a[i];
			}
		}
		if ((0 - temp2) > temp1) {
			System.out.println(temp2);
		} else if ((0 - temp2) < temp1) {
			System.out.println(temp1);
		} else {
			System.out.println("Both are on same far");
		}

	}

}
