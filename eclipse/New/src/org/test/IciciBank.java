package org.test;

public class IciciBank extends Details {

	private void ifscCode() {
		System.out.println("Icici Bank Ifsc Code is icici7837");
	}
	private void accNumber() {
		System.out.println("Icici Account Number is 764746764");

	}
	
	public static void main(String[] args) {
		
		IciciBank icici = new IciciBank();
		icici.name();
		icici.phone();
		icici.address();
		icici.aadhar();
		icici.ifscCode();
		icici.accNumber();
		
	}
	
}
