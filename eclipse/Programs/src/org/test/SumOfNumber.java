package org.test;

public class SumOfNumber {
	public static void main(String[] args) {
		
	int num=54321;
	int sum=0,i=0,a=num;
	while (a>0) {
		i = a%10;
		sum = sum+i;
		a = a/10;
	}
	System.out.println(sum);
	}
}
