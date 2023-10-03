package Collection_Programming;

public class P02_Employee {

	private Integer empNo;
	private String name;
	private String company;
	private Integer number;

	public P02_Employee(Integer empNo, String name, String company, Integer number) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.company = company;
		this.number = number;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "P02_Employee [empNo=" + empNo + ", name=" + name + ", company=" + company + ", number=" + number + "]";
	}
}