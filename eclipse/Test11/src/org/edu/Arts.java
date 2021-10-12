package org.edu;

public class Arts extends Education {

	private void bSc() {
		System.out.println("Computer Science");
		System.out.println("Physics");
		System.out.println("Chemistry");
	}
	
	private void bEd() {
		System.out.println("English");
		System.out.println("Tamil");
	}
	private void bA() {
		System.out.println("Economics");
		System.out.println("Literature");
}

@Override
	public void ug() {
	System.out.println("Arts UG");
}
	@Override
	public void pg() {
	
		System.out.println("PG Degree in Arts");

	}
	
	public static void main(String[] args) {
		Arts a = new Arts();
		a.bA();
		a.ug();
		a.pg();
		a.bEd();
		a.bA();
	
	}


}
