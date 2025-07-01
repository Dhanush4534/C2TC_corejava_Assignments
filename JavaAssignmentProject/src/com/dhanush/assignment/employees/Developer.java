package com.dhanush.assignment.employees;

public class Developer extends Employee {
	private String programmingLanguage;
	public Developer(String name,String employeeid,double salary,String programmingLanguage) {
		super(name,employeeid,salary);
		this.programmingLanguage=programmingLanguage;
	}
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

}
