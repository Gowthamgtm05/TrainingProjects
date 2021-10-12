package org.test;

public class CountOfNumber {
public static void main(String[] args) {
	
	int num=54321,count=0, a=num;
	while (a>0) {
		count++;
		a=a/10;
	}
		System.out.println(count);
	}
}
