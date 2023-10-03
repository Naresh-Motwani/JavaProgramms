package Collection_Programming;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P04_BookService_MainClass {

	public List<P04_Book> getBookinSort() {
		List<P04_Book> books = new P04_BookDAO().getBooks();
		Collections.sort(books, new MyComparator());
		return books;
	}

	public static void main(String[] args) {
		System.out.println(new P04_BookService_MainClass().getBookinSort());
	}
}

class MyComparator implements Comparator<P04_Book> {

	@Override
	public int compare(P04_Book o1, P04_Book o2) {
		return o1.getPages() - o2.getPages();
	}

}
