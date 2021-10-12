package org.programs;

public class CountOfNumber {
	public static void main(String[] args) {
		long a=5432187677798798l;
		int count=0;
		while (a>0) {
			count++;
			a=a/10;
		}
System.out.println(count);		
		
	}
}
