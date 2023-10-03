package programs;

//WAP to print Star pattern
public class P14_Star02 {

	public static void main(String[] args) {

		int n = 5;
		pyramidPattern(n);

	}

	private static void pyramidPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
