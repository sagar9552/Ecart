package com.AutomationPractice.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import com.AutomationPractice.qa.Util.Utilitys;

public class BaseClassData {
	
	public static Logger log = LogManager.getLogger(BaseClassData.class);

	public static WebDriver driver;
	public static Properties props;
	
	
	public BaseClassData() throws IOException {
		
		props = new Properties();
		
		FileInputStream ip =  new FileInputStream("C:\\Users\\sagar\\eclipse-workspace\\MysecondProject\\src\\main\\java"
												+ "\\com\\opencart\\qa\\config\\config.properties");
		props.load(ip);
						
	}
	
	@BeforeClass
	public static void initialization() {	
		
		log.info("***before class ***");
		String browserName = props.getProperty("browser");
		if(browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chrome.EXE\\1\\chromedriver_win32 "+"(4)\\chromedriver.exe");
			 driver = new ChromeDriver();
			 log.info("***ChromeDriver Launch****");
		}
		
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sagar\\Downloads\\"
										+ "geckodriver-v0.33.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.info("***FirefoxDriver Launch****");
		}
		
		else if(browserName.equals("safari")) 
		{
			System.setProperty("","");
			driver = new SafariDriver();
			log.info("***SafariDriver Launch****");
		}
		
		else 
		{
			System.out.println("no browser value is given");
			log.info("***no browser value is given****");
		}

		driver.manage().window().maximize();
		log.info("***maximise the browser***");

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Utilitys.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utilitys.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(props.getProperty("baseurl"));
		log.info("***launch the application***");
	}

	@AfterClass
	public void tearDown() throws InterruptedException
	{   
		Thread.sleep(2000);
		driver.quit();
		log.info("*** @AfterClass closed the browser***");
	}


}
