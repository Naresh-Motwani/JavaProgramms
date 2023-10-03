package java8;

public class P20_Employee {

	int id, salary;
	String name, grade;

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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "P20_Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", grade=" + grade + "]";
	}

	public P20_Employee(int id, int salary, String name, String grade) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.grade = grade;
	}

}
