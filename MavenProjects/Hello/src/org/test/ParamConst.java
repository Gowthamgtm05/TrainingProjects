package org.test;

public class ParamConst {

	String name;
	String num;

		ParamConst(String det_Name, String det_Number){
		name = det_Name;
		num = det_Number;
		}
	
	
	public static void main(String[] args) {
		
		ParamConst pc = new ParamConst("hello", "hai");
		
		System.out.println(pc.name);
		System.out.println(pc.num);
	}
	
	
}
