package org.college;

public class College {

	private void collegeName() {
	System.out.println("College Name is Anna University");
	}
	private void collegeCode() {
		System.out.println("College Code is 2313");
	}
	private void collegeRank() {
	System.out.println("Colleg Rank is 12th");
	}
	
	public static void main(String[] args) {
		College college = new College();
		Student student = new Student();
		Hostel hostel = new Hostel();
		Dept dept = new Dept();
		
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		student.studentId();
		hostel.hostelName();
		dept.depatName();
	}
}
