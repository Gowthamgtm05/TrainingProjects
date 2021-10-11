package org.practice;

public class Practice1 {
	
	
	Practice1(){
		method1("Ram", 1220);
		method2();
	}

	private void method1(String name, int num) {
		System.out.println(name="arun");
		System.out.println(num=8373);
	}
	
	private void method2() {
		System.out.println("method 2");

	}
	
	public static void main(String[] args) {
		Practice1 p = new Practice1();
	}
}
