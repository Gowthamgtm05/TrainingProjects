package org.overriding;

public class MethodOverRiding extends Class2 {
	
	@Override
	public void loan() {
		System.out.println("7%");
	}
	
	@Override
	public void interest() {
		System.out.println("4%");
	}

public static void main(String[] args) {
	MethodOverRiding m = new MethodOverRiding();
	m.loan();
	m.interest();
}

}
