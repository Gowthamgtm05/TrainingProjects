package org.test;

public class Sample {

	static int a;
	
	private void demo() {
		a=100;
		System.out.println("a in method :"+a);
	}
	
	public static void main(String[] args) {
		System.out.println("Before obj creation:"+a);
		Sample s = new Sample();
		s.demo();
		System.out.println("After obj Creation:"+s.a);
	
		Sample s1 = new Sample();
		System.out.println("After new obj without method calling:"+s.a);
		
	}
	
	
	
	
	
	
	
	
	
	

}
