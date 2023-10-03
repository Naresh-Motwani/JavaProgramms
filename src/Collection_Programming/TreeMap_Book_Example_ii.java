package Collection_Programming;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Book_Example_ii {

	public static void main(String[] args) {

		Map<Integer, TreeMap_Book_Example_i> map = new TreeMap<Integer, TreeMap_Book_Example_i>();

		TreeMap_Book_Example_i book1 = new TreeMap_Book_Example_i(101, 8, "Let us C", "Yashwant Kanetkar", "BPB");
		TreeMap_Book_Example_i book2 = new TreeMap_Book_Example_i(102, 7, "Data Communications & Networking",
				"Forouzan", "Mc Graw Hill");
		TreeMap_Book_Example_i book3 = new TreeMap_Book_Example_i(103, 9, "Operating System", "Galvin", "Wiley");

		map.put(1, book2);
		map.put(2, book3);
		map.put(3, book1);

		for (Map.Entry<Integer, TreeMap_Book_Example_i> entry : map.entrySet()) {
			int a = entry.getKey();
			TreeMap_Book_Example_i b = entry.getValue();

			System.out.println(a + " Details");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}