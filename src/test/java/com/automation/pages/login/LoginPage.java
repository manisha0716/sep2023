package com.automation.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.base.BasePage;

public class LoginPage extends BasePage{
	@FindBy(id="username") WebElement userNameElement;
	@FindBy(id="password") WebElement passwordElement;
	@FindBy(id="Login") WebElement loginButtonElement;
	@FindBy(id="rememberUn") WebElement rememberChkElement;
	@FindBy(id="forgot_password_link") WebElement forgotpasswordElement;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterUserName(String data) {
		//userNameElement.sendKeys(data);
		enterText(userNameElement, data, "Username textbox");
	}
	public void enterPassword(String data) {
			enterText(passwordElement, data, "password field");
		}
			
	
	public WebDriver clickLoginButton() {
		clickElement(loginButtonElement,"login button");
		return driver;
		
	}
	
	public void clickrememberChk() {
		clickElement(rememberChkElement,"remember ChkBox");	
	}
	
	public void clickforgotpasswordlink() {
		clickElement(forgotpasswordElement,"forgot password link");	
	}
	
	public String getTitleOfThePAge() {
		//waitUntilPageLoads();
		return getPageTitle();
	}
	
	

	
}
