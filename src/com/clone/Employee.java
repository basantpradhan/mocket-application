package com.clone;

public class Employee implements Cloneable{

	private String empName;
	private String department;
	private double salary;
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		Employee emp =  (Employee) super.clone();
		emp.setAddress(new Address());
		return emp;
	}
}
