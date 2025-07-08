package com.capgemini.concept;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capgemini.basepackage.BaseClass;

public class WebDriverDemo {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Good Morning");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/v1/");
		
//		WebElement userName = driver.findElement(By.id("user-name"));
//		userName.sendKeys("standard_user");
//		WebElement passWord = driver.findElement(By.name("password"));
//		passWord.sendKeys("secret_sauce");
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='LOGIN']"));
//		loginBtn.click();
		
//		WebElement logo = driver.findElement(By.xpath("//div[@class='peek']"));
//		System.out.println(logo.isDisplayed());
//		Thread.sleep(2000);
		
//		driver.quit();
		
		
//		BaseClass bc = new BaseClass();
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.readProperty("SiteUrl"));
		WebElement userName = BaseClass.searchElmentID("user-name");
		userName.sendKeys(BaseClass.readProperty("UserName"));
		Thread.sleep(2000);
		BaseClass.searchElmentName("password").sendKeys(BaseClass.readProperty("PassWord"));
		BaseClass.searchElmentXpath("//input[@value='LOGIN']").click();
		Thread.sleep(2000);
		
		WebElement logo = BaseClass.searchElmentXpath("//div[@class='peek']");
		System.out.println(logo.isDisplayed());
		Thread.sleep(2000);
		
		BaseClass.closeBrowser();
		
	}

}
