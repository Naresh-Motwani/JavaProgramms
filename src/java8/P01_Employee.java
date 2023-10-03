package java8;

import java.util.List;

public class P01_Employee {

	private int empId;
	private String empName;
	private int age;
	private String gender;
	private Double salary;
	private String doj;
	private int deptId;
	private String deptName;
	private String status = "active";
	private List<String> project;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getProject() {
		return project;
	}

	public void setProject(List<String> project) {
		this.project = project;
	}

	public P01_Employee(int empId, String empName, int age, String gender, Double salary, String doj, int deptId,
			String deptName, String status, List<String> project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.doj = doj;
		this.deptId = deptId;
		this.deptName = deptName;
		this.status = status;
		this.project = project;
	}

	@Override
	public String toString() {
		return "P01_Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", gender=" + gender
				+ ", salary=" + salary + ", doj=" + doj + ", deptId=" + deptId + ", deptName=" + deptName + ", status="
				+ status + ", project=" + project + "]";
	}

}
