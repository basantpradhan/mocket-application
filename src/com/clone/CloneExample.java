package com.clone;

public class CloneExample {

	public static void main(String args []) throws CloneNotSupportedException{
		
		Employee emp = new Employee();
		
		emp.setEmpName("Basant pradhan");
		emp.setDepartment("SDE");
		emp.setSalary(10000);
		
		Address address = new Address();
		address.setStreet("Sector 48");
		address.setCity("Noida");
		address.setState("Uttar pradesh");
		emp.setAddress(address);
		
		
		Employee emp1 = (Employee) emp.clone();
		emp1.setEmpName("Raju");
		
		Address addr = emp1.getAddress();
		addr.setCountry("nepal");
		
		System.out.println(addr.getCountry());
		System.out.println(emp1.getEmpName());
		
		System.out.println("____original____");
		System.out.println(address.getCountry());
        System.out.println(emp.getEmpName());
		System.out.println(emp);
		System.out.println(emp1);
		
	}
}
