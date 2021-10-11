package org.test;

public class Newtest {

	int collectedAmount = 1000;

	private int collectAmountAndGiveToMe() {
		System.out.println("collected amount " + collectedAmount);
		return collectedAmount;
	}

	public static void main(String[] args) {
		Newtest nw = new Newtest();
		
		//Return Type without return type we can't store the 
		// value from the method to another variable
		
		int one = nw.collectAmountAndGiveToMe();
		System.out.println(one);

	}
}
