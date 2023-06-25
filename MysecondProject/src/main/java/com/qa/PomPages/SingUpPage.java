package com.qa.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPage {

	//webElements
		@FindBy(className = "name")
		private WebElement name;
		
		@FindBy(className = "name")
		private WebElement emailAddress;
		
		@FindBy(xpath = "//button[@data-qa='signup-button']")
		private WebElement singUpButton;

		private WebDriver driver ;
		
		
		//constructor
		public SingUpPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);	
			this.driver = driver ;	
		}
		
		public void userName_Method() 
		{
			name.clear();
			name.sendKeys("sagar");
			
			emailAddress.clear();
			emailAddress.sendKeys("sagar123@gmail.com");
		}
		
		public void clickOn_signUpButton() 
		{
			Actions act = new Actions(driver);
			act.moveToElement(singUpButton).click().perform();
		}
		
}
