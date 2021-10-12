package org.programs;

public class Palindrome {
	public static void main(String[] args) {

		int a = 5151;
		int i=0,j=0;
		for (int j2 = 0; j2 < a ; j2++) {

		i=(a%10);
		j=(j*10)+i;
		a=(a/10);
		
		}
		System.out.println(j);
		
		if (a==j) {
			
			System.out.println("Palindrome");
			
		} else {
			System.out.println("Not Palindrome");
		}
	}
	
		


}
