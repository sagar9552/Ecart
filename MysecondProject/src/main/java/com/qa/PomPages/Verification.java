package com.qa.PomPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome.EXE\\1\\chromedriver_win32 "+"(4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//test case 1
		driver.get("https://accounts.lambdatest.com/login");
		LoginPage1 loginpage = new LoginPage1(driver);
		
		loginpage.sendusername();
		loginpage.sendpassword();
		loginpage.loginbutton();

		Header headers = new Header(driver);
		headers.clickdashboard();
		String url =driver.getCurrentUrl() ;
		String Title = driver.getTitle();

		if (url .equals("https://accounts.lambdatest.com/dashboard")&& Title.equals("Welcome - LambdaTest")) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		headers.clicklogout();
		headers.clicklogout2(); 
		
		//test case = 2 
		driver.get("https://accounts.lambdatest.com/login");
		Thread.sleep(3000);
		loginpage.sendusername();
		loginpage.sendpassword();
		loginpage.loginbutton();
		
		Thread.sleep(3000);
		headers.clickhyperexute();
		Thread.sleep(5000);
		
		String url2 =driver.getCurrentUrl();
		String title2 = driver.getTitle();
	
		Thread.sleep(2000);
		if (url2 .equals("https://hyperexecute.lambdatest.com/quickstart?origin=try-now")&& title2.equals("LambdaTest-HyperExecute")) 
		{
			System.out.println("pass");
			System.out.println("print the url-----"+url2);
			System.out.println("print the title-----"+title2);
		}
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='try-now-modal-heading-icon-container']")).click();
		
		headers.clicklogout();
		headers.clicklogout2(); 
		
		Thread.sleep(2000);
		driver.quit();

	}
}


