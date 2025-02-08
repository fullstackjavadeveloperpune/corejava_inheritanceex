package com.fullstack.oops.inheritance;

class Company {

	void showCompanyInfo(int cId, String cName, String cAddress) {
		System.out.println("\n Company Id: " + cId + "\n Company Name: " + cName + "\n Company Address: " + cAddress);
	}

}

class Customer extends Company {

	void showCustomerInfo(int custId, String custName, long custContactNumber) {
		System.out.println("\n Customer Id: " + custId + "\n Customer Name: " + custName
				+ "\n Customer Contact Number: " + custContactNumber);

	}

}

class Product extends Customer {

	void showProductInfo(int productId, String productName, double productPrice) {
		System.out.println("\n Product Id: " + productId + "\n Product Name: " + productName + "\n Product Price: "
				+ productPrice);

	}
}

public class MultilevelInheritanceEx {

	public static void main(String[] args) {

		Product product = new Product();
		product.showCompanyInfo(111, "FULL STACK JAVA DEVELOPER", "PUNE, INDIA");
		product.showCustomerInfo(121, "SWARA", 9898998989L);
		product.showProductInfo(101, "APPLE PHONE", 250000.45);
	}

}
