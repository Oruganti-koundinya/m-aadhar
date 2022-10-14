package com.basic.capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AadharRegisteration {
	
	static WebDriver driver = null;

	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\tools\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");
		
	}
	
	@Test
	public void TestHome() {
		driver.get("http://localhost:4200/home");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/a[2]")).click();
		driver.get("http://localhost:4200/register");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("name")).sendKeys("Eddard Stark");
		driver.findElement(By.id("dob")).sendKeys("1312-1-10");
		driver.findElement(By.id("emailid")).sendKeys("e.stark@got.com");
		driver.findElement(By.id("address")).sendKeys("North to Kingslanding, Winterfell");
		driver.findElement(By.id("mobileno")).sendKeys("9876543210");
		driver.findElement(By.id("gender")).sendKeys("male");
		driver.findElement(By.id("register")).click();
	}
}
