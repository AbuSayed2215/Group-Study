package com.yellowautomation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void setup () {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://www.hotwire.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public static void main(String[] args) {
		//BaseClass.setup();
	}

}
