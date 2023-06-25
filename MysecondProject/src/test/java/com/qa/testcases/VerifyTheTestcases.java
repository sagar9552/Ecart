package com.qa.testcases;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import com.AutomationPractice.qa.base.BaseClassData;

public class VerifyTheTestcases extends BaseClassData{
	
	
	public VerifyTheTestcases() throws IOException 
	{
		super();
	}
	@BeforeMethod
	public void beforeMethod()
	{
		
	log.info("=========BEFORE METHOD INITIALIZED========");
	}

	@Test(priority = 1)
	public void verifyTheHeadersNameList()
	{
		
	log.info(" === @TEST(1) verify TheHeaders NameList======");
	}
	
	@Test(priority = 2)
	public void verifyTheAddToCardModule()
	{
		log.info("======@TEST(2)verify The AddToCard Module======");
	
	}
	
	@AfterMethod
	public void afterMethod()
	{
		log.info("****After Method clear the objects *****");
		
	}}
