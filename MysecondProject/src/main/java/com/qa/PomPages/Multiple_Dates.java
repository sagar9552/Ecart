package com.qa.PomPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Dates
{

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome.EXE\\1\\chromedriver_win32 "+"(4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mybookingsite.io/inst/#home?propertyId=241I3JR3ssAMj9DEjUxNDE4OCI=&JDRN=Y");
		
		
		driver.findElement(By.className("btn-close")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='iconText'])[1]")).click();
		Thread.sleep(2000);
		
		
	WebElement day1 =	driver.findElement(By.xpath("(//span[text()='14'])[1]"));

	WebElement day2 =	driver.findElement(By.xpath("(//span[text()='20'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(day1).click().build().perform();
		act.moveToElement(day2).click().build().perform();

	}

}
