package java8;

import java.util.Collections;
import java.util.List;

//service class where main method is there and start task.

public class P06_BookService {

	public List<P06_Book> getBooksInSort() {
		List<P06_Book> books = new P06_BookDAO().getBooks();

		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}

	public static void main(String[] args) {
		System.out.println(new P06_BookService().getBooksInSort());
	}

}

/*
 * class MyComparator implements Comparator<P06_Book> {
 * 
 * @Override public int compare(P06_Book o1, P06_Book o2) { return
 * o2.getName().compareTo(o1.getName()); }
 * 
 * }
 */
