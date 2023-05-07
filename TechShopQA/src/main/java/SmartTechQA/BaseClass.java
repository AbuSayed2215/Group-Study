package SmartTechQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static void setup () {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/ChromeDriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.smarttechqa.com/login");
	
	driver.findElement(By.id("email")).sendKeys("abusayed@gmail.com");
	
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	}
	
	public static void main(String[] args) {
		BaseClass.setup();
	}

}
