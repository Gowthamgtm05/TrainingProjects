package org.test;
// Child 1
public class AxisBank extends Details {

	private void ifscCode() {
		System.out.println("Axis Bank Ifsc Code is axis9393");
	}
	private void accNumber() {
		System.out.println("Axis Account Number is 8374833");

	}
	
	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.name();
		axis.phone();
		axis.address();
		axis.aadhar();
		axis.ifscCode();
		axis.accNumber();
	}
	
}
