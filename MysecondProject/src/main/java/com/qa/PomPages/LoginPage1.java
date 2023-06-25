package com.qa.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	@FindBy (xpath = "//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@id='login-button']")
	private WebElement login;
	
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername() throws InterruptedException {
		
		username.sendKeys("pravinab91@gmail.com");
	}
	public void sendpassword() {
		password.sendKeys("8668382046");
	}
	
	public void loginbutton() {
		login.click();
	}
	
}
