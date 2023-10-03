package expriment;

public class SumPair {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] + a[j] == 8 && a[i] != a[j]) {
					System.out.println(" " + a[i] + " " + a[j]);
				}
			}
		}

	}
}
