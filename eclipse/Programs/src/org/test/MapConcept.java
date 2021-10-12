package org.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
	
	Map<Character,Integer> m = new LinkedHashMap< >();

	m.put('g', 1);
	m.put('e', 1);
	m.put('e', 4);
	
	System.out.println(m);
	}
}
