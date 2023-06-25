package com.qa.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SingUp_Information_Page {
	//webElements
	@FindBy(id = "id_gender1")
	private WebElement mr;
	
	@FindBy(id = "password")
	private WebElement password;
	
	//WebElements for drop Down
	@FindBy(xpath = "//select[@id='days']")
	private WebElement day;
	
	@FindBy(xpath = "//select[@id='months']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@id='years']")
	private WebElement year;
	
	@FindBy(id = "first_name")
	private WebElement first_name;
	
	@FindBy(id = "last_name")
	private WebElement last_name;
	
	//country drop down
	@FindBy(xpath = "//select[@id='country']")
	private WebElement country;
	
	@FindBy(className = "state")
	private WebElement state;
	
	@FindBy(className = "city")
	private WebElement city;
	
	@FindBy(className = "zipcode")
	private WebElement zipcode;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	private WebElement mobile_number;
	
	@FindBy(xpath = "//button[text()='Create Account']")
	private WebElement create_account;
	

	private WebDriver driver ;
	
	
	//constructor
	public SingUp_Information_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
		this.driver = driver ;	
	}
	
	public void clickOn_Mr_RadioButton() 
	{
		mr.click();
	}
	
	public void sendPassword() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(password).sendKeys("*sb@9552#$").build().perform();
	}
	
	public void select_DropDown_day()
	{
		Select s1 = new Select(day);
		s1.deselectByVisibleText("1");
	}
	
	public void select_DropDown_month()
	{
		Select s2 = new Select(month);
		s2.deselectByVisibleText("June");
	}
	
	public void select_DropDown_year()
	{
		Select s3 = new Select(year);
		s3.selectByValue("1994");
	}
	
	
	public void sendFirstName()
	{
		first_name.sendKeys("Sagar");
	}
	
	
	public void sendLastName()
	{
		last_name.sendKeys("Battise");
	}
	
	
	public void select_CountryDropDown()
	{
		country.clear();
		
	}
}
