package org.org.emp;

import java.util.Scanner;

	public class EmployeeDetails {
	public static void main(String[] args) {
	System.out.println("Enter the Employee Details");
	Scanner empInfo = new Scanner(System.in);
	Scanner empDetails = new Scanner(System.in);
	
	System.out.println("Enter the Employee ID");
	int empID = empInfo.nextInt();
	System.out.println("Employee Id is :"+empID);
	
	System.out.println("Enter the Employee Name");
	String empName = empDetails.nextLine();
	System.out.println("Employee Name is :"+empName);
	
	System.out.println("Enter the Employee Email");
	String empEmail = empDetails.nextLine();
	System.out.println("Employee Mail Id is :"+empEmail);

	System.out.println("Enter the EMployee PhoneNum :");
	long phoneNum = empInfo.nextLong();
	System.out.println("Employee Phone Number :"+phoneNum);
	
	System.out.println("Enter the Employee Salary");
	long empSalary = empInfo.nextLong();
	System.out.println("Employee Salary is :"+empSalary);
	
	System.out.println("Employee Gender is :");
	char gender = empDetails.next().charAt(0);
	System.out.println("Employee Gender is :"+gender);
	
	System.out.println("Enter the Employee City :");
	String city = empDetails.next();
	System.out.println("Employee City is :"+city);
	}
	
	
}