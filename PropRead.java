package com.capgemini.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PropRead {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\CoreAutomation\\src\\test\\resources\\Source\\Credential.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty("UserName");
		System.out.println(value);
		
	}

}
