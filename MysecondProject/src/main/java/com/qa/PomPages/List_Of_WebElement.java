package com.qa.PomPages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class List_Of_WebElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chrome.EXE\\1\\chromedriver_win32 "+"(4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.mybookingsite.io/inst/#home?propertyId=241I3JR3ssAMj9DEjUxNDE4OCI=&JDRN=Y");
		
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='start-Date-Input']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='rdrDayNumber'])[17]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		//for drop down
		WebElement room = driver.findElement(By.xpath("//select[@class='form-select']"));
		room.click();
		Select s = new Select(room);
		s.selectByIndex(1);
		
		driver.findElement(By.xpath("//button[text()='Book']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(5000);
		WebElement compbooking= driver.findElement(By.xpath("//button[text()='Complete Booking']"));
		compbooking.click();

		WebElement firstname = driver.findElement(By.xpath("//input[@id='f_0_0']"));
		firstname.sendKeys("join");

		WebElement lastname = driver.findElement(By.xpath("//input[@id='l_0_0']"));
		lastname.sendKeys("Bandewar");

		WebElement adult=driver.findElement(By.xpath("(//select[@class='form-control form-select'])[1]"));
		Select p = new Select(adult);
		p.selectByIndex(0);

		WebElement child=driver.findElement(By.xpath("(//select[@class='form-control form-select'])[2]"));
		Select t = new Select(child);
		t.selectByIndex(0);

		WebElement arrivaltime=driver.findElement(By.xpath("//select[@class='form-control form-select formInput']"));
		Select a = new Select(arrivaltime);
		a.selectByVisibleText("12:00 pm");

		WebElement select =driver.findElement(By.xpath("//input[@id='react-select-2-input']"));
		select.clear();
		select.sendKeys("90");
		select.sendKeys(Keys.ENTER);

		driver.findElement(By.id("phone")).sendKeys("123456789");

		WebElement emailid =driver.findElement(By.xpath("//input[@id='email']"));
		emailid .sendKeys("join@bandewar");

		JavascriptExecutor jp = (JavascriptExecutor) driver;
		jp.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);

		WebElement cbooking =driver.findElement(By.xpath("//button[text()='Confirm Booking']"));
		cbooking.click();	

		Thread.sleep(4000);

		WebElement creditcard =driver.findElement(By.xpath("//input[@id='cc_number']"));
		creditcard.sendKeys("4111111111111111");
		Thread.sleep(2000);

		//for select the month
		driver.findElement(By.xpath("(//div[@class='dropdown exp-dropdown'])[1]")).click();
		
		Thread.sleep(2000);
		List<WebElement> Month =driver.findElements(By.xpath("(//div[@class='dropdown exp-dropdown'])[1]//li"));

		for (WebElement e : Month)
		{
			e.getSize();
			String name = e.getText();
			System.out.println(name);

			if(name.equals("02"))
				e.click();
			
		}
		
		
		//for select the year
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='dropdown exp-dropdown'])[2]")).click();
		Thread.sleep(2000);
		List<WebElement> year =driver.findElements(By.xpath("(//div[@class='dropdown exp-dropdown'])[2]//li"));
		
		int m =year.size();
		System.out.println(m);
		
		for (WebElement e : year)
		{
			
			String name = e.getText();
			System.out.println(name);
			if(name.equals("2024"))
				e.click();
		
		}

	}

}
