package org.test;

public class HdfcBank extends Details {

	private void ifscCode() {
		System.out.println("Hdfc Bank Ifsc Code is hdfc9499");
	}
	private void accNumber() {
		System.out.println("Hdfc Account Number is 78664674626");

	}
	
	public static void main(String[] args) {
		HdfcBank hdfc = new HdfcBank();
		hdfc.name();
		hdfc.phone();
		hdfc.address();
		hdfc.aadhar();
		hdfc.ifscCode();
		hdfc.accNumber();
		
		
	}
}
