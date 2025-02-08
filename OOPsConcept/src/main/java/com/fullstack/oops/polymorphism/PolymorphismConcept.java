package com.fullstack.oops.polymorphism;

class Department {

	void show(int deptId, String deptName) {

		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);
	}

	void show(String deptCode) {
		System.out.println("\n Department Code: " + deptCode);
	}

}

class Employee extends Department {

	@Override
	void show(int deptId, String deptName) {
		// TODO Auto-generated method stub

		super.show(111, "Research & Development");
		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);
	}

	void display(int empId, String empName, double empSalary) {

		System.out.println(
				"\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee Salary: " + empSalary);
	}

}

public class PolymorphismConcept {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.show(101, "HR");
		employee.show("HR99");
		employee.display(121, "SWARA", 97000.96);
	}

}
