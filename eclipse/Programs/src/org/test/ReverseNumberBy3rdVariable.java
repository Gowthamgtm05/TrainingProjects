package org.test;

public class ReverseNumberBy3rdVariable {
	public static void main(String[] args) {
	int num=12345,i=0,j=0, a= num;
	while (a>0) {
		i = a%10;
		j = (j*10)+i;
		a = a/10;
		}
	if (num == j) {
		System.out.println("palindrome");
	} else {
		System.out.println("Not Palindrome");
	}
	System.out.println("Reverse Number " + j);
	}
}
