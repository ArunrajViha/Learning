package com.capgemini.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\DELL\\Desktop\\Book1.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wk = new XSSFWorkbook(fis);
			
			Sheet sheet = wk.createSheet("Test");
			Row row = sheet.createRow(5);
			Cell cell = row.createCell(4);
			
			cell.setCellValue("AiiTE");
			
			FileOutputStream fos = new FileOutputStream(file);
			wk.write(fos);
			wk.close();
			System.out.println("File write completed");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}

}
