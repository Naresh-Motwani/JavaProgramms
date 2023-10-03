package java8;

import java.util.List;

public class P17_Customer_i {

	private int id;
	private String name, email;
	private List<String> numbers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "P17_Customer [id=" + id + ", name=" + name + ", email=" + email + ", numbers=" + numbers + "]";
	}

	public P17_Customer_i(int id, String name, String email, List<String> numbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.numbers = numbers;
	}

}
