package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ChromeDriverClass {
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("---beforeMethod---");
		System.setProperty("webdriver.chrome.driver", "C:\\chrome.EXE\\1\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test1()
	{
		System.out.println("---test1----");
		System.out.println(" Hello ");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("---afterMethod---");
	}
	
	
	


}
