package Arrays;

public class Main {
	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3,5 };
		Integer[] m = { 6, 5, 4,7 ,5,8,9,7,5};
		Integer numMoves1 = 0, numMoves2 = 0;
		Integer num1 = 0, num2 = 0;
		Integer digit1 = 0, digit2 = 0;
		// Forward
		for (int i = 0; i < a.length; i++) {
			num1 = a[i];
			num2 = m[i];
			for (Integer j = 0; j < a.length; j++) {
				digit1 = num1 % 10;
				digit2 = num2 % 10;
				numMoves1 += Math.abs(digit1 - digit2);
				num1 = (num1 - digit1) / 10;
				num2 = (num2 - digit2) / 10;
			}
		}
		// Backward
		for (int i = 0; i < a.length; i++) {
			num1 = m[i];
			num2 = a[i];
			for (Integer j = 0; j < a.length; j++) {
				digit1 = num1 % 10;
				digit2 = num2 % 10;
				numMoves2 += Math.abs(digit1 - digit2);
				num1 = (num1 - digit1) / 10;
				num2 = (num2 - digit2) / 10;
			}
		}
		if (numMoves1 > numMoves2) {
			// Answer is numMoves1
		} else if (numMoves1 < numMoves2) {
			// Answer is numMoves2
		} else {
			// Answer is any one, i.e, either numMoves1 or numMoves2
		}
		System.out.println(numMoves1 + " & " + numMoves2);
	}
}