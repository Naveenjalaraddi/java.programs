package oopsconceptsprograms;

import java.util.Scanner;

class Employeedetails {
	int empid;
	String empname;
	double empsalary;

	public Employeedetails(int empid, String empname, double empsalary) {
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;

	}

}

public class Employee {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("How many Employee details you will be enter: ");
		int size = scn.nextInt();

		Employeedetails employee[] = new Employeedetails[size];
		System.out.println();
		System.out.println("Enter a Employee details one by one: ");
		System.out.println("--------------------------------------");
		for (int i = 0; i < employee.length; i++) {
			System.out.print("Enter " + (i + 1) + ".Employee id: ");
			int empid = scn.nextInt();
			System.out.print("Enter " + (i + 1) + ".Employee name: ");
			String empname = scn.next();
			System.out.print("Enter " + (i + 1) + ".Employee salary: ");
			double empsalary = scn.nextDouble();
			System.out.println();

			employee[i] = new Employeedetails(empid, empname, empsalary);
		}
		System.out.println();
		System.out.println("**** Employee Details ****");
		for (int i = 0; i < employee.length; i++) {
			System.out.println("===========================");
			System.out.println("Employee id: " + employee[i].empid);
			System.out.println("Employee Name: " + employee[i].empname);
			System.out.println("Employee Salary: " + employee[i].empsalary);
		}

		scn.close();
	}

}
