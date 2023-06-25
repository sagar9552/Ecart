package com.AutomationPractice.qa.Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Demo_TestNG {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("----**beforeClass first time** only for lanch the browser-----");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sagar\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		
	}
	
	@Test
	public void verify_The_AttrributeMethod()
	{
		System.out.println("---beforeMethod login to the application---");
		String name =driver.findElement(By.xpath("(//span[@class='d-none d-md-inline'])[3]")).getAttribute("class");
		System.out.println(name);
		
		String name3 =driver.findElement(By.xpath("(//span[@class='d-none d-md-inline'])[3]")).getText();
		System.out.println(name3);
		

		String name2 = driver.findElement(By.xpath("(//li[@class='list-inline-item']//a)[10]")).getAttribute("title");
		System.out.println(name2);
	}
	

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("---afterMethod logout to the application---");
		try {
			Thread.sleep(3000);	
			} 
		catch (InterruptedException e) 
			{
			e.printStackTrace();
			}
		driver.quit();
	}

}
