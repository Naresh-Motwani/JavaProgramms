package Collection_Programming;

import java.util.ArrayList;
import java.util.List;

public class P04_BookDAO {

	public List<P04_Book> getBooks() {

		List<P04_Book> books = new ArrayList<>();

		books.add(new P04_Book("Java", 350, 756.00, "Java", 2011));
		books.add(new P04_Book("Python", 200, 600.00, "Python", 2013));
		books.add(new P04_Book("SQL", 150, 500.00, "SQL", 2011));
		books.add(new P04_Book("DSA", 250, 567.00, "DSA", 2009));
		books.add(new P04_Book("Spring", 500, 800.00, "Spring", 2014));

		return books;

	}

}
