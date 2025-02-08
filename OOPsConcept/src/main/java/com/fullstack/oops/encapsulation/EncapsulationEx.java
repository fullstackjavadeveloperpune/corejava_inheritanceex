package com.fullstack.oops.encapsulation;

public class EncapsulationEx {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setEmpId(121);
		employee.setEmpName("SWARA");
		employee.setEmpSalary(97000.96);

		System.out.println("\n Employee Id: " + employee.getEmpId() + "\n Employee Name: " + employee.getEmpName()
				+ "\n Employee Salary: " + employee.getEmpSalary());
	}

}
