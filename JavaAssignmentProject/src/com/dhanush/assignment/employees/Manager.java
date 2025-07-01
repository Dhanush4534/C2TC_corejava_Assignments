package com.dhanush.assignment.employees;

public class Manager extends Employee {
	private String departments;
	public Manager(String name,String employeeid,double salary,String departments) {
		super(name,employeeid,salary);
		this.departments=departments;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	

}
