package org.company;

public class CompanyInfo {
	
	
	private void companyName() {
		System.out.println("Company Info:");
	}
	private void companyName(int id) {
		System.out.println("Company Registration id is:"+id);
	}
	private void companyName(String compName) {
		System.out.println("Company Name is:"+compName);
	}
	private void companyName(long mobNum) {
		System.out.println("Company Contact mobile number:"+mobNum);
	}
	private void companyName(String email, long landLine) {
		System.out.println("Company email Id is:"+email);
		System.out.println("Company Landline Number is"+landLine);
	}
	public static void main(String[] args) {
		CompanyInfo compInfo = new CompanyInfo();
		compInfo.companyName();
		compInfo.companyName(563894);
		compInfo.companyName("TCS PVT LTD");
		compInfo.companyName(78676476547l);
		compInfo.companyName("emp@tcs.com", 84820l);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
