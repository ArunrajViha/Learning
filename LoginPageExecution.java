package com.capgemini.pageexecution;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.capgemini.basepackage.BaseClass;
import com.capgemini.basepackage.Utilities;
import com.capgemini.pagefactory.LoginPage;

public class LoginPageExecution {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//TC001 - Login with valid credential
		Utilities.printDateTime();
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.readProperty("SiteUrl"));
		System.out.println("Launching the application");
		LoginPage lp = new LoginPage();
//		WebElement userName = BaseClass.searchElmentID(lp.userName);
//		userName.sendKeys(BaseClass.readProperty("UserName"));
		lp.userName.sendKeys(BaseClass.readProperty("UserName"));
		Thread.sleep(2000);
//		BaseClass.searchElmentName(lp.passWord).sendKeys(BaseClass.readProperty("PassWord"));
		lp.passWord.sendKeys(BaseClass.readProperty("PassWord"));
//		BaseClass.searchElmentXpath(lp.loginBtn).click();
		lp.loginBtn.click();
		Thread.sleep(2000);
		
//		WebElement logo = BaseClass.searchElmentXpath(lp.logo);
		System.out.println(lp.logo.isDisplayed()+ " Logo displayed!");
		Thread.sleep(2000);		
		BaseClass.closeBrowser();
		Utilities.printDateTime();
		
		//TC002 - Login with invalid credential
		Utilities.printDateTime();
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.readProperty("SiteUrl"));
		System.out.println("Launching the application");
		LoginPage lp2 = new LoginPage();
//		WebElement userName2 = BaseClass.searchElmentID(lp2.userName);
//		userName2.sendKeys(BaseClass.readProperty("UserName"));
		lp2.userName.sendKeys(BaseClass.readProperty("UserName"));
		Thread.sleep(2000);
//		BaseClass.searchElmentName(lp2.passWord).sendKeys(BaseClass.readProperty("InvPwd"));
		lp2.passWord.sendKeys(BaseClass.readProperty("InvPwd"));
//		BaseClass.searchElmentXpath(lp2.loginBtn).click();
		lp2.loginBtn.click();
		Thread.sleep(2000);
		
//		WebElement errMsg = BaseClass.searchElmentXpath(lp2.errorMsg);
		System.out.println(lp2.errorMsg.isDisplayed()+ " Erro Message Displayed");
		Thread.sleep(2000);		
		BaseClass.closeBrowser();		
		Utilities.printDateTime();
	}

}
