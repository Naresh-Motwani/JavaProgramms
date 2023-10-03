package Collection_Programming;

public class P04_Book {
	private String bookname;
	private int pages;
	private double price;
	private String authorname;
	private int yearOfPublish;

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public P04_Book(String bookname, int pages, double price, String authorname, int yearOfPublish) {
		super();
		this.bookname = bookname;
		this.pages = pages;
		this.price = price;
		this.authorname = authorname;
		this.yearOfPublish = yearOfPublish;
	}

	@Override
	public String toString() {
		return "P04_Book [bookname=" + bookname + ", pages=" + pages + ", price=" + price + ", authorname=" + authorname
				+ ", yearOfPublish=" + yearOfPublish + "]";
	}

}
