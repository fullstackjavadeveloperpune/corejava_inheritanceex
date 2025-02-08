package com.fullstack.oops.inheritance;

class Department {
	void show(int deptId, String deptName) {
		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);
	}
}

class Employee extends Department {

	void display(int empId, String empName, double empSalary) {
		System.out.println(
				"\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee Salary: " + empSalary);
	}

}

public class SingleInheritanceEx {

	public static void main(String[] args) {

		/*
		 * Employee employee = new Employee();
		 * 
		 * employee.show(101, "HR"); employee.display(121, "SWARA", 97000.96);
		 */

		/*
		 * Employee employee = (Employee) new Department(); employee.show(101, "HR");
		 * employee.display(121, "SWARA", 97000.96);
		 */

		Department department = new Employee();
		department.show(101, "HR");
		((Employee) department).display(121, "SWARA", 97000.96);
	}

}
