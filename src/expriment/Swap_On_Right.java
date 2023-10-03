package expriment;

public class Swap_On_Right {

	public static void main(String[] args) {

		int[] number = new int[] { 1, 8, 0, 4, 9, 0, 4, 0, 6, 0, 7 };
		int temp = 0;
		System.out.println(number.length);

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
				} else {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}}
			for (int ele : number) {
				System.out.print(ele + " ");
			}
		}

	
}
