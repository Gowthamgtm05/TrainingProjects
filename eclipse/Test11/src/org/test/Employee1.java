package org.test;

public class Employee1 {

	public void empId() {
		System.out.println("Employee Info:");
	}		
	public void empId(int id) {
		System.out.println("Employee ID is :"+id);
	}		
	public void empId(String name) {
		System.out.println("Employee Name is:"+name);
	}		
	public void empId(long mobNum) {
		System.out.println("Employee Mobile Number is:"+mobNum);
	}		
	public void empId(String email,long altNumber) {
		System.out.println("Employee email Id is:"+email);
		System.out.println("Employee Alternate Number is:"+altNumber);
	}		
	public void empId(char gender) {
		System.out.println("Employee Gender is:"+gender);
	}		
		
	
	public static void main(String[] args) {
		
		Employee1 em = new Employee1();
		em.empId();
		em.empId(7847);
		em.empId("arun");
		em.empId(8457859434l);
		em.empId("arun@gmail.com", 8974657443l);
		em.empId('M');
	}
	
	
	
}
