package com.capgemini.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\DELL\\Desktop\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);
		
		Sheet sheet = wk.getSheet("Sheet1");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		for(int i=0; i<noOfRows; i++) {
			Row row = sheet.getRow(i);
			int noOfCells = row.getPhysicalNumberOfCells();
			for(int j=0; j<noOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType==CellType.NUMERIC) {
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateValue = cell.getDateCellValue();
						SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
						String format = sf.format(dateValue);
						System.out.println(format);
					}
					else {
						double numericValue = cell.getNumericCellValue();
						int numberValue = (int) numericValue;
						System.out.println(numberValue);
					}
					
				}
				else if(cellType==CellType.STRING) {
					String stringValue = cell.getStringCellValue();
					System.out.println(stringValue);
				}
			}
		}
		
		wk.close();
	}

}
