package org.edu;

//child class
public class Education extends Arts {

	private void uG() {
		System.out.println("UG Courses Are :");
	}
	
	
	private void pG() {
System.out.println("PG Courses Are :");
	}
	
	
	public static void main(String[] args) {
		
		Education e = new Education();
		e.uG();
		
		e.bA();
		e.bBA();
		e.bEd();
		e.bsc();
		
		e.pG();
		
		e.bE();
		e.bTech();
		e.dental();
		
		
		
	}
	
	
	
	
	
	
	
}
