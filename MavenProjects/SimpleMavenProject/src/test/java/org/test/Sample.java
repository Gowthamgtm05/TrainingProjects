package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) throws IOException {
		
	
	File f = new File("C:\\Users\\LENOVO-HOMEPC\\MavenProjects\\SimpleMavenProject\\Excel\\Book.xlsx");
	
	FileInputStream fin = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fin);
	
	Sheet sheet = w.getSheet("Sheet1");
	
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	
	for (int i = 0; i < physicalNumberOfRows; i++) {
		
		Row row = sheet.getRow(i);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		
		for (int j = 0; j < physicalNumberOfCells; j++) {
			
			Cell cell = row.getCell(j);
			
			System.out.println(cell);
			
		}
		
	}
	
	
	}	
}
