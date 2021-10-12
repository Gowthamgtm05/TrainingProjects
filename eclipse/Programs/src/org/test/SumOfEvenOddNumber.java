package org.test;

public class SumOfEvenOddNumber {
	
	public static void main(String[] args) {
		
		int eSum=0,oSum=0;
		
		for (int i = 0; i <= 10; i++) {
			
			if (i%2==0) {
				eSum = eSum+i;
			} else {
				oSum = oSum+i;
			}
		}
		System.out.println(eSum);
		System.out.println(oSum);
	}

}
