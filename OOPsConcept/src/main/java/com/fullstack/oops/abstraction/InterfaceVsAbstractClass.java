package com.fullstack.oops.abstraction;

interface Department {

	void showDepartmentInfo(int deptId, String deptName);

	static void set() {
		System.out.println("I am from static");
	}

	default void get() {
		System.out.println("I am from default");
	}
}

interface Employee {

	void showEmployeeInfo(int empId, String empName, double empSalary);

}

abstract class Product {

	abstract void showProductInfo(int productId, String productName, double productPrice);

	void displayProductData(String productDescription) {
		System.out.println("\n Product Description: " + productDescription);
	}

}

class Company extends Product implements Department, Employee {

	@Override
	public void showEmployeeInfo(int empId, String empName, double empSalary) {
		// TODO Auto-generated method stub
		System.out.println(
				"\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee Salary: " + empSalary);
	}

	@Override
	public void showDepartmentInfo(int deptId, String deptName) {
		// TODO Auto-generated method stub
		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);
	}

	@Override
	void showProductInfo(int productId, String productName, double productPrice) {
		// TODO Auto-generated method stub
		System.out.println("\n Product Id: " + productId + "\n Product Name: " + productName + "\n Product Price: "
				+ productPrice);
	}

	void showCompanyInfo(int cId, String cName, String cAddress) {

		System.out.println("\n Company Id: " + cId + "\n Company Name: " + cName + "\n Compnay Address: " + cAddress);

	}

}

public class InterfaceVsAbstractClass {

	public static void main(String[] args) {

		Company company = new Company();
		company.showDepartmentInfo(101, "HR");
		Department.set();
		company.get();
		company.showEmployeeInfo(121, "SWARA", 97000.96);
		company.showProductInfo(111, "APPLE PHONE", 250000.99);
		company.displayProductData("SMART PHONE");
		company.showCompanyInfo(12345, "Full Stack", "PUNE, INDIA");
	}

}
