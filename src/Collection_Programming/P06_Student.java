package Collection_Programming;

public class P06_Student implements Comparable<P06_Student> {

	private String name, standardClass;
	private int age, Roll_Number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandardClass() {
		return standardClass;
	}

	public void setStandardClass(String standardClass) {
		this.standardClass = standardClass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoll_Number() {
		return Roll_Number;
	}

	public void setRoll_Number(int roll_Number) {
		Roll_Number = roll_Number;
	}

	public P06_Student(String name, String standardClass, int age, int roll_Number) {
		super();
		this.name = name;
		this.standardClass = standardClass;
		this.age = age;
		Roll_Number = roll_Number;
	}

	@Override
	public String toString() {
		return "P06_Student [name=" + name + ", standardClass=" + standardClass + ", age=" + age + ", Roll_Number="
				+ Roll_Number + "]";
	}

	@Override
	public int compareTo(P06_Student o) {

		return this.getName().compareTo(o.getName());
	}
	
	

}