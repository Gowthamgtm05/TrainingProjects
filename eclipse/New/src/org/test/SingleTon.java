package org.test;

public class SingleTon {
	static SingleTon s;
	
	private SingleTon() {
	}	
	
	public static SingleTon add() {
		if(s==null) {
		s = new SingleTon();
	}
	return s;
	}
		
	
	public void memere() {
System.out.println("jhjfhjfr");
	}
	
	public static void method2() {

		System.out.println("heghegheg");
	}
		public static void main(String hel) {
			
			SingleTon s = add();
			s.memere();
			hel = "hello";
		}
	
}

