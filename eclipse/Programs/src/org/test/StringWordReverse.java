package org.test;
public class StringWordReverse {
	public static void main(String[] args) {
		String s = "Welcome to Greens Technology";
		String[] sp = s.split(" ");
		String s1 = " ";
		
	for (int i = sp.length-1; i >= 0; i--) {
		s1= s1+sp[i]+"";
	}
    System.out.println(s1);
	}
}
