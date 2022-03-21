package com.te.learn.interfaces.functionals;

public final class Employee {
	private int eId;
	private String eName;
	private int eAge;
	private int eSalary;
	public Employee() {
		super();
	}
	public Employee(int eId, String eName, int eAge, int eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary=eSalary;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + "]";
	}
	
	

}
