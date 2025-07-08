package com.capgemini.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch(){
//		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
//	public static void browserMaximize(){
////		WebDriver driver = new ChromeDriver();
////		driver.manage().window().maximize();
//	}
	
	public static void loadUrl(String url){
//		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static WebElement searchElmentID(String id){
//		WebDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	
	public static WebElement searchElmentName(String name){
//		WebDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	
	public static WebElement searchElmentXpath(String xpath){
//		WebDriver driver = new ChromeDriver();
//		WebElement element = driver.findElement(By.xpath(xpath));
//		return element;
		
		return driver.findElement(By.xpath(xpath));
	}
	
	public static void closeBrowser(){
//		WebDriver driver = new ChromeDriver();
		driver.quit();
	}
	
	public static String readProperty(String key) throws IOException{
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\CoreAutomation\\src\\test\\resources\\Source\\Credential.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty(key);
//		System.out.println(value);
		return value;
	}

}
