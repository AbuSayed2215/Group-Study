package Practice.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static void setUp() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.smarttechqa.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public static void main(String[] args) {
		int a[]= {10,20,3,30,50,70};
		int min=a[0];
		
		for(int i=1; i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
			int number  = 12321;
			//if(isPlaindrome(number))
			{
				
			}
				
				
		}
		System.out.println(min);
	}
	

}
