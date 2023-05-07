package com.yellow.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Utilities;

public class TestNGpractice {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.smarttechqa.com/");
		
	}
	@Test(priority=1)
	public static void validationPractice () throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/header/nav/div/div/div/a[3]")).click();
		driver.findElement(By.id("email")).sendKeys("abusayed@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/form/button")).click();
		//Utilities.getExplicitWait(driver.findElement(By.id("username")), 50);
		Thread.sleep(2000);
		String actual = driver.findElement(By.id("username")).getText();
		Assert.assertTrue(actual.contains("ABU SAYED"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority=2)
	public static void product() throws InterruptedException {
		driver.findElement(By.linkText("Airpods Wireless Bluetooth Headphones")).click();
		Thread.sleep(2000);
		String actualproduct = driver.findElement(By.xpath("(//*[text()='Airpods Wireless Bluetooth Headphones'])[2]")).getText();
		Assert.assertTrue(actualproduct.contains("AIRPODS"));
	}
	@Test (priority=3)
	public static void addtocart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Airpods Wireless Bluetooth Headphones")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn-block btn btn-primary']")).click();
		Thread.sleep(2000);
		String actualincart = driver.findElement(By.xpath("//*[text()='Shopping Cart']")).getText();
		Assert.assertTrue(actualincart.contains("SHOPPING CART"));
		
	}
	@AfterTest
	public static void teardown() {
		driver.close();
	}
}
