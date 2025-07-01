package com.dhanush.assignment.utilities;
import com.dhanush.assignment.employees.Developer;
import com.dhanush.assignment.employees.Manager;
import com.dhanush.assignment.utilities.EmployeeUtilities;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager("Alice", "01", 80000, "HR");
        Developer developer = new Developer("Bob", "D001", 60000, "Java");

        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartments());

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Language: " + developer.getProgrammingLanguage());

        System.out.println("\nIncreasing Developer's salary by 10%...");
        EmployeeUtilities.increaseSalary(developer, 10);
        System.out.println("Updated Salary: " + developer.getSalary());
		

	}

}
