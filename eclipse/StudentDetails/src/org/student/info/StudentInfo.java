package org.student.info;

import java.util.Scanner;

public class StudentInfo {

	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Student Name :");
		String name = s.next();
		System.out.println("Student Name is :"+name);
	
		System.out.println("Enter the Student Id :");
		short id = s1.nextShort();
		System.out.println("Student Id is :"+id);
	
		System.out.println("Enter the Mark1");
		short mark1 = s1.nextShort();
		System.out.println("Mark 1 is :"+mark1);
		
		System.out.println("Enter the Mark2");
		short mark2 = s1.nextShort();
		System.out.println("Mark 2 is :"+mark2);
		
		System.out.println("Enter the Mark3");
		short mark3 = s1.nextShort();
		System.out.println("Mark 3 is :"+mark3);
		
		System.out.println("Enter the Mark 4");
		short mark4 = s1.nextShort();
		System.out.println("Mark 4 is :"+mark4);
			
		System.out.println("Enter the Mark 5");
		short mark5 = s1.nextShort();
		System.out.println("Mark 5 is :"+mark5);
	
		int totalMarks = (mark1+mark2+mark3+mark4+mark5);
		System.out.println("Total Marks are :"+totalMarks);
	
		double average = ((mark1+mark2+mark3+mark4+mark5)/5);
		System.out.println("Average Mark is :"+average);
	}
	
	
}
