package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

class P12_MinRow_MaxColumn {

	/*
	 * // Functionto find all the matrix elements // which are minimum in its row
	 * and maximum // in its column
	 */
	public static Vector<Integer> minmaxNumbers(int[][] matrix, Vector<Integer> res) {

		// Initialize unordered set
		Set<Integer> set = new HashSet<Integer>();

		// Traverse the matrix
		for (int i = 0; i < matrix.length; i++) {
			int minr = Integer.MAX_VALUE;
			for (int j = 0; j < matrix[i].length; j++) {

				// Update the minimum
				// element of current row
				minr = Math.min(minr, matrix[i][j]);
			}

			// Insert the minimum
			// element of the row
			set.add(minr);
		}

		for (int j = 0; j < matrix[0].length; j++) {
			int maxc = Integer.MIN_VALUE;
			for (int i = 0; i < matrix.length; i++) {

				// Update the maximum
				// element of current column
				maxc = Math.max(maxc, matrix[i][j]);
			}

			// Checking if it is already present
			// in the unordered_set or not
			if (set.contains(maxc)) {
				res.add(maxc);
			}
		}
		return res;
	}

	// Driver code
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Vector<Integer> ans = new Vector<Integer>();

		// Function call
		ans = minmaxNumbers(mat, ans);

		// If no such matrix
		// element is found
		if (ans.size() == 0)
			System.out.println("-1");

		for (int i = 0; i < ans.size(); i++)
			System.out.println(ans.get(i));
	}
}
