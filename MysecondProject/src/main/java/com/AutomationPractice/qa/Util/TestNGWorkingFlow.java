package com.AutomationPractice.qa.Util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class TestNGWorkingFlow {
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("----**beforeClass first time** only for lanch the browser-----");
		
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("---beforeMethod login to the application---");
	}
	
	@Test
	public void test1()
	{
		System.out.println("---test1 is pass----");
		
		//log.info("==========verifyTheHeadersNameList===========");
		
		//List<WebElement> names = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));

//		System.out.println(names.size());
//
//		for (WebElement sagar : names) 
//		{
//			String allNames =	sagar.getText();
//			System.out.println(allNames);
//		}
		
		//log.info("*********verifyTheHeadersNameList is passed******");
	}
	
	@Test
	public void test2()
	{
		System.out.println("---test2 is pass----");
	}
	@Test
	public void test3()
	{
		System.out.println("---test3 is passed----");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("---afterMethod logout to the application---");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("-----*****afterClass AT ONLY ONE LAST TIME **** quit the browser-----");
	}
		


}
