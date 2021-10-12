package org.programs;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s ="Gowtham hello world";
		String[] sp = s.split(" ");
		String empty = "";
		for (String x : sp) {
			String rev ="";
		for (int i = x.length()-1; i>=0 ; i--) {
			rev = rev+x.charAt(i);
			}
		empty=empty+rev+" ";
		}
		System.out.println(empty);
	}
}
