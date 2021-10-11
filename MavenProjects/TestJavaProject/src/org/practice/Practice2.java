package org.practice;

public class Practice2 {
	
	Practice2(){
		System.out.println("Inside Constructor");
	}
	
		private void tempMethod() {
			System.out.println("Temporary Method");
		}
	
	public static void main(String[] args) {
		Practice2 p = new Practice2();
		p.tempMethod();
		
	}
	
}
