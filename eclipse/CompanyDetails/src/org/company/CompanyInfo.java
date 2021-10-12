package org.company;

public class CompanyInfo {
public static void main(String[] args) {
	CompanyInfo ki = new CompanyInfo();
	ki.phoneName();
	ki.phoneImei();
	ki.camera();
	ki.storage();
	ki.osName();
}
	private void phoneName() {
		System.out.println("Phone Name is Samsung");
	}
	private void phoneImei() {
		System.out.println("Phone Imei is 8357983588");

	}
	private void camera() {
		System.out.println("Phone Camera is 32 mega pixel");
	}
	private void storage() {
		System.out.println("Phone Storage is 64 gb");
	}
	private void osName() {
		System.out.println("Phone OperatigSystem is Android");
	}
	
}
