package org.test;

public class Sample {
	
	
	public static void main(String[] args) {
		int eCount = 0, oCount = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
				eCount++;
			} else {
				oCount++;
			}
		}
		System.out.println(eCount);
		System.out.println(oCount);
	
	}
}
