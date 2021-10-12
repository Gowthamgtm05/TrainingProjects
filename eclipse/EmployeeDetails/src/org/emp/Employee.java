package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("Employee Id is 202");

	}
	private void empName() {
		System.out.println("Employee Name is Arun");

	}private void empDob() {
		System.out.println("Employee Date of Birth is 01.02.1990");

	}
	private void empPhone() {
		System.out.println("Employee phone is 9876543210");
		
	}
	private void empEmail() {
		System.out.println("Employee Email is arun@gmail.com");

	}
	private void empAddress() {
		System.out.println("Employee Address is Chennai");

	}
	
	public static void main(String[] args) {
		Employee s = new Employee();
		s.empId();
		s.empName();
		s.empDob();
		s.empPhone();
		s.empEmail();
		s.empAddress();
	}

}
