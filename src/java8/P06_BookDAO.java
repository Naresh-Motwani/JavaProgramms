package java8;

import java.util.ArrayList;
import java.util.List;
//Resourse class where we write api 
public class P06_BookDAO {

	public List<P06_Book> getBooks() {
		List<P06_Book> books = new ArrayList<P06_Book>();
		books.add(new P06_Book(101, "Core Java", 200));
		books.add(new P06_Book(102, "Python", 400));
		books.add(new P06_Book(103, ". Net", 600));
		books.add(new P06_Book(104, "Power BI", 1500));
		books.add(new P06_Book(105, "Web Development", 1200));
		return books;
	}

}
