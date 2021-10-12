package org.test;


//Polymorphism Method Overloading 

public class Sample {
	
	public void empInfo(int id) {
		System.out.println("enter the id "+id);
	}
	public void empInfo(String mobNum) {
		System.out.println("enter the company name is "+mobNum);

	}
	public void empInfo(long mobNum) {
		System.out.println("employee mob num"+mobNum);

	}
	public void empInfo(String name,long mobNum) {
		System.out.println("enter the name is"+mobNum);
		System.out.println("enter the number "+name);
}
				public static void main(String[] args) {
					
					Sample s = new Sample();
					s.empInfo(6565);
					s.empInfo("hello world");
					s.empInfo(787875834);
					s.empInfo("ggegf", 775466579);
				}
}
