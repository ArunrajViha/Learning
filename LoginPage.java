package com.capgemini.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.basepackage.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
//	public String userName = "user-name"; //ID
//	public String passWord = "password"; //Name
//	public String loginBtn = "//input[@value='LOGIN']"; //xpath
//	public String logo = "//div[@class='peek']"; //xpath
//	public String errorMsg = "//button[@class='error-button']"; //xpath
	
//	@FindBy  = driver.findElement(By.)
	
//	WebElement userName = driver.findElement(By.id("user-name"));
	@FindBy(id="user-name")
	public WebElement userName;	
	
//	WebElement passWord = driver.findElement(By.name("password"));
	@FindBy(name="password")
	public WebElement passWord;
	
//	WebElement loginBtn = driver.findElement(By.xpath("//input[@value='LOGIN']"));
	@FindBy(xpath="//input[@value='LOGIN']")
	public WebElement loginBtn;
	
//	WebElement logo = driver.findElement(By.xpath("//div[@class='peek']"));
	@FindBy(xpath="//div[@class='peek']")
	public WebElement logo;
	
//	WebElement errorMsg = driver.findElement(By.xpath("//button[@class='error-button']"));
	@FindBy(xpath="//button[@class='error-button']")
	public WebElement errorMsg;

}
