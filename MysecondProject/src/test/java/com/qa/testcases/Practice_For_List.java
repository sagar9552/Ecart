package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_For_List {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome.EXE\\1\\chromedriver_win32 "
				+ "(4)\\chromedriver.exe");
		WebDriver 	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.mybookingsite.io/inst/#home?propertyId=241I3JR3ssAMj9DEjUxNDE4OCI=&JDRN=Y");
		
		Thread.sleep(3000);
		driver.findElement(By.className("btn-close")).click();
		Thread.sleep(2000);
		
		WebElement	Book = driver.findElement(By.xpath("//button[text()='Book']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].ScrollIntoView();", Book);
		Book.click();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		WebElement complete_Booking = driver.findElement(By.xpath("//button[text()='Complete Booking']"));
		complete_Booking.click();
		Thread.sleep(2000);
	WebElement select =	driver.findElement(By.xpath("//input[@id='react-select-2-input']"));
	select.clear();
	select.sendKeys("90");
	Thread.sleep(1000);
	select.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.id("phone")).sendKeys("9552751954");
	}
	
}	
		
