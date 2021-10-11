package org.test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class Sample {

public static void main(String[] args) {
	
	Clipboard systemSelection = Toolkit.getDefaultToolkit().getSystemSelection();
	
	System.out.println("Screen Size is " + systemSelection);
}	
	
}
