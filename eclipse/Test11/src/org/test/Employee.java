package org.test;

public class Employee {


	public void empInfo() {
		System.out.println("Employee Info :");
	}
	public void empInfo(int id) {
		System.out.println("Employee Id is :"+id);
	}
	public void empInfo(String s) {
		System.out.println("Employee Name is :"+s);
	}
	public void empInfo(String email, long  mobNum) {
		System.out.println("Employee Email id is :"+email);
		System.out.println("EMployee Mobile Number is :"+mobNum);
	}
	public void empInfo(char gender) {
		System.out.println("Employee Gender is :"+gender);
	}
	

public static void main(String[] args) {
	Employee e = new Employee();
	e.empInfo();
	e.empInfo(24443);
	e.empInfo("Ram");
	e.empInfo("ram@gmail.com", 8945476473l);
	e.empInfo('M');
}




}