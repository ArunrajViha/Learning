package com.capgemini.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\DELL\\Desktop\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);
		
		Sheet sheet = wk.getSheet("Demo");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		
		System.out.println(cell);
		cell.setCellValue("Academy");
		
		FileOutputStream fos = new FileOutputStream(file);
		wk.write(fos);
		wk.close();
		System.out.println("Completed");
	}

}
