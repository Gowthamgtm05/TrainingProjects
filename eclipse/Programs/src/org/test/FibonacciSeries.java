package org.test;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a=0,b=1;
		for (int i = 0; i <= 5; i++) {
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
	}
}