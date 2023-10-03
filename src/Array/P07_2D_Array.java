package Array;

public class P07_2D_Array {

	public static void main(String[] args) {

		int[][] numbers = { { 1, 2, -5 }, { 0, -5, 16 }, { 7, -1, 9 } };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] < min) {
					min = numbers[i][j];
				}

			}
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i][j] > max) {
					max = numbers[i][j];
				}
			}
		}
		System.out.println(min + " " + max);

	}

}
