package org.test;

import java.util.Scanner;

public class Hello {

	  public static void main(String[] args) {
	
		  Scanner s = new Scanner(System.in);
		  
		  System.out.println("Enter the age :");
		  byte age = s.nextByte();
		  System.out.println("Age is :"+ age);
	  
		  if (age>=18) {
			System.out.println("Eligible to Vote");
		} else {
			System.out.println("Not Eligible to Vote");
		}
	  
	  }
	  
}