package com.qa.PomPages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chrome.EXE\\1\\chromedriver_win32 "+"(4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/");
		
		Thread.sleep(1000);
		WebElement footer =	driver.findElement(By.className("site-footer-row-container-inner"));
		List<WebElement> links = footer.findElements(By.tagName("a"));
		int count =	links.size();
		System.out.println("the number of the links in the footer section is ----->"+count);

		Thread.sleep(4000);
		WebElement blogLink = driver.findElement(By.linkText("Execute Python"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", blogLink);
		blogLink.click();
		
		Thread.sleep(2000);
		String title2 = driver.getTitle();
		Assert.assertEquals(title2, "Online Python Compiler (Editor / Interpreter / IDE) to Run Code");
		System.out.println(title2);
		
		Thread.sleep(2000);
		driver.navigate().back();
		String title1 = driver.getTitle();
		
		
		if(title1.equals("Meet Guru99 – Free Training Tutorials & Video for IT Courses")) 
		{
			System.out.println("test case pass");
			System.out.println("the title of the current page is----->"+title1);
			driver.quit();
		}
		else 
		{
			System.out.println("testcase failed");
		}
			
		
		System.out.println("END");

	}

}
