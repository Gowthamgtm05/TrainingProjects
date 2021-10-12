package org.file.opreation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperation {

	
	public static void main(String[] args) throws IOException {
		
	File f = new File("C:\\Users\\LENOVO-HOMEPC\\Desktop\\fileutils\\file1.txt");
//	boolean createfile = f.createNewFile();
//	System.out.println(createfile);
	
//	List<String> readLines = FileUtils.readLines(f);
//	for (String string : readLines) {
//		System.out.println(string);
//	}
//	System.out.println("to read file");
	String ref = FileUtils.readFileToString(f);
	System.out.println(ref);
	}
}

