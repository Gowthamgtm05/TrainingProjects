package org.listcreate;

import java.util.ArrayList;
import java.util.List;

public class ListCreate {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(30);
		l.add(50);
		l.add(20);
		l.add(40);
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
	}
}
