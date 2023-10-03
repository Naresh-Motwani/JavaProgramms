package java8;

public class P13_Stream_Project_Employee {

	private int id, salary;
	private String name, dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "P13_Stream_Project_Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept
				+ "]";
	}

	public P13_Stream_Project_Employee(int id, int salary, String name, String dept) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}

}
