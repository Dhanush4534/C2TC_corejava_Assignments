package com.dhanush.assignment.utilities;
import com.dhanush.assignment.employees.Employee;

public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee e) {
		System.out.println("Name"+e.getName());
		System.out.println("ID"+e.getEmployeeid());
		System.out.println("Salary"+e.getSalary());
		
	}
	public static void increaseSalary(Employee e,double percent)
	{
		double newSalary=e.getSalary()+(e.getSalary()*percent/100);
		e.setSalary(newSalary);
	}

}
