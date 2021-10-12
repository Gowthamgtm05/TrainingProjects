package org.polymorphism;

public class MethodOverloading {
	
	//parent class
	
	public void empDetails(String name) {
		System.out.println("Emp name is " + name);
	}
	public void empDetails(int age) {
		System.out.println("Emp age is " + age);
	}
	public void empDetails(long mobNumber) {
		System.out.println("Emp name is " + mobNumber);
	}

	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.empDetails("Arun");
		m.empDetails(25);
		m.empDetails(99887653662l);
	
	}

}
