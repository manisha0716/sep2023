package com.automation.tests.scripts;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.home.HomePage;
import com.automation.pages.login.LoginPage;
import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class SalesforceAutomationScripts extends BaseTest {

	
	public void Testcase1() throws InterruptedException {
		
		myLog.info("******login_to_Salesforce automation script started***********");
		String expected="Login Form: Please enter your password.";
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		String password="";
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		driver=loginPage.clickLoginButton();
		
	}
	
	
	public void Testcase2() throws InterruptedException {
		
		myLog.info("******login_to_Salesforce automation script started***********");
		String expected="Login Form: Successful login";
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		String password=pro.getPropertyValue("login.valid.password",p);
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		driver=loginPage.clickLoginButton();
		
	}
	
	
	public void Testcase3() throws InterruptedException {
		
		myLog.info("******login_to_Salesforce automation script started***********");
		String expected="Login Form: Remember checkBox clicked";
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		String password=pro.getPropertyValue("login.valid.password",p);
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickrememberChk();
		driver=loginPage.clickLoginButton();
		
	}

	
	public void Testcase4a() throws InterruptedException {
		
		myLog.info("******login_to_Salesforce automation script started***********");
		String expected="Login Form: Forgot Password";
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.clickforgotpasswordlink();
		driver=loginPage.clickLoginButton();
		
	}
	
	@Test
	public void Testcase4b() throws InterruptedException {
		
		myLog.info("******login_to_Salesforce automation script started***********");
		String expected="Login Form: Login Failure";
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.invalid.userid",p);
		String password=pro.getPropertyValue("login.invalid.password",p);
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		driver=loginPage.clickLoginButton();
		
	}
	
}