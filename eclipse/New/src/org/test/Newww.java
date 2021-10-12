package org.test;

public class Newww {

	public static void main(String[] args) {
			
		String  s =new String("HeLLo");
		String empty= "";
		char b='\u0000';
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			
			if(Character.isUpperCase(c)) {
				 b = Character.toLowerCase(c);
			}
			
			else if(Character.isLowerCase(c)) {
				 b = Character.toUpperCase(c);
			}
			
			System.out.print(empty+b);
		}
	}	
	

}
