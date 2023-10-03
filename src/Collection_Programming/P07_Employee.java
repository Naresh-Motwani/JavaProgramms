package Collection_Programming;

public class P07_Employee {
	
	private String name,email;
	private int number,EmpNo;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public P07_Employee(String name, String email, int number, int empNo) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		EmpNo = empNo;
	}
	@Override
	public String toString() {
		return "P07_Employee [name=" + name + ", email=" + email + ", number=" + number + ", EmpNo=" + EmpNo + "]";
	}
	
	
	

}
