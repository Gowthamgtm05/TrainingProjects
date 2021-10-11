package org.test;

public class NewEmp {
	
		// Parameterized Construcctor
		
	private void name(String name) {
		System.out.println("name is "+name);
	}

	private void age(int age) {
		System.out.println("age is "+age);
	}
	
	public static void main(String[] args) {
		
		NewEmp em = new NewEmp();
		em.age(2132);
		em.name("rajesh");
		
	}

}
