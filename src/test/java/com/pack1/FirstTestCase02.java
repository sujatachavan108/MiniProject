package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase02 {

	public RemoteWebDriver driver = null;

	@BeforeMethod
	public void invokeBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}

	@Test
	public void loginTest() throws InterruptedException {

		System.out.println("this is workdone by rajDnare");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#login-button")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
	Thread.sleep(5000);
		driver.close();
	}
}
