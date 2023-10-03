package expriment;

public class MaxAndMinArray {

	public static void main(String[] args) {

		int a[] = { 50, 20, 60, 40, 10, 30 };

		int max = a[0];
		int min = a[0];
		System.out.println("Max ==>" + max + " Min ==>" + min);
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Max ==>" + max + " Min ==>" + min);
	}
}