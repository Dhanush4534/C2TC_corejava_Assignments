package employeee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		// Create Commission object
		Commission emp = new Commission();

		// Accept employee details
		System.out.print("Enter Name: ");
		emp.setName(sc.nextLine());

		System.out.print("Enter Address: ");
		emp.setAddress(sc.nextLine());

		System.out.print("Enter Phone: ");
		emp.setPhone(sc.nextLine());
		System.out.print("Enter Sales Amount: ");
		emp.setSalesAmount(sc.nextDouble());

		// Calculate and print commission
		emp.calculateCommission();
		System.out.println(emp);

	}

}
