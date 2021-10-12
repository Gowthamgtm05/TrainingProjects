package org.interf.code;

public class Class1 implements InterfaceCode {

	@Override
	public void method1() {
		System.out.println("hello");
	}

	@Override
	public void method2() {
		System.out.println("hai");
	}

public static void main(String[] args) {
	Class1 c = new Class1();
	c.method1();
	c.method2();
}

}
