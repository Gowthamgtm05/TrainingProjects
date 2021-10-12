package org.test;

import java.util.ArrayList;
import java.util.List;

public class FirstDay {
	
	public static void main(String[] args) {

		List <Integer> l = new ArrayList();		
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(20);
		l.add(40);
		l.add(40);
		l.add(10);

		System.out.println(l);
		int size = l.size();
	System.out.println(l);
		Integer integer = l.get(3);
	System.out.println(integer);
		l.add(3, 100);
	System.out.println(l);
		l.set(4, 200);
	System.out.println(l);
		int indexOf = l.indexOf(10);
	System.out.println(indexOf);
		int lastIndexOf = l.lastIndexOf(10);
	System.out.println(lastIndexOf);
		
		
	}
	

}