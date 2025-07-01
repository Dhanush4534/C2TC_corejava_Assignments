package com.dhanush.assignment.employees;

public class Employee {
	private String name;
	private String employeeid;
	private double salary;
	public Employee(String name,String employeeid,double salary) {
		this.name=name;
		this.employeeid=employeeid;
		this.salary=salary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
